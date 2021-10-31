<template>
    <div class="app-container">
        <!--查询表单-->
        <el-form :inline="true" class="demo-form-inline"> 
            <el-form-item> 
                <el-input v-model="userQuery.id" placeholder="用户ID"/>
            </el-form-item> 

            <el-form-item> 
                <el-input v-model="userQuery.nickname" placeholder="用户名"/>
            </el-form-item> 

            <el-form-item> 
                <el-input v-model="userQuery.mobile" placeholder="手机号码"/>
            </el-form-item> 

            <el-form-item> 
                <el-input v-model="userQuery.level" placeholder="用户等级" /> 
            </el-form-item> 
            
            <el-form-item label="添加时间"> 
                <el-date-picker
                    v-model="userQuery.begin"
                    type="datetime"
                    placeholder="选择开始时间"
                    value-format="yyyy-MM-dd HH:mm:ss"
                    default-time="00:00:00"
                />
            </el-form-item> 
            
            <el-form-item> 
                <el-date-picker
                    v-model="userQuery.end"
                    type="datetime"
                    placeholder="选择截止时间"
                    value-format="yyyy-MM-dd HH:mm:ss"
                    default-time="00:00:00"
                />
            </el-form-item> 
            
            <el-button type="primary" icon="el-icon-search" @click="getList()">查询</el-button> 
            <el-button type="default" @click="resetData()">清空</el-button>
        </el-form>

        <!-- 表格 -->
        <el-table
            v-loading="listLoading"
            :data="list"
            element-loading-text="玩命加载中"
            border
            fit
            highlight-current-row> 
            
            <el-table-column
                label="序号"
                width="70"
                align="center"> 
                <template slot-scope="scope">
                    {{ (page - 1) * limit + scope.$index + 1 }}
                </template>
            </el-table-column> 

            <el-table-column prop="id" label="用户ID" width="180" />
            
            <el-table-column prop="nickname" label="用户名" width="100" />

            <el-table-column prop="mobile" label="手机号" width="120" />

            <el-table-column prop="level" label="等级" width="50" />  

            <el-table-column prop="isVip" label="会员" width="50" >
                <template slot-scope="scope">
                    {{ scope.row.isVip ? '是' : '否' }}
                </template>
            </el-table-column>

            <el-table-column prop="sign" label="个性签名" width="150"/>
            
            <el-table-column prop="createTime" label="添加时间" width="180"/>

            <el-table-column prop="modifyTime" label="修改时间" width="180"/>

            <el-table-column label="操作" align="center"> 
                <template slot-scope="scope"> 
                    <router-link :to="'/user/edit/'+scope.row.id"> 
                        <el-button type="primary" size="mini" icon="el-icon-edit">修改</el-button>
                    </router-link> 
                    <el-button v-if="!scope.row.isDisabled" type="warning" size="mini" icon="el-icon-edit" @click="disableUser(scope.row.id, scope.row.isDisabled)">封禁</el-button>
                    <el-button v-if="scope.row.isDisabled" type="warning" size="mini" icon="el-icon-edit" @click="disableUser(scope.row.id, scope.row.isDisabled)">恢复</el-button>
                    <el-button type="danger" size="mini" icon="el-icon-delete" @click="removeUser(scope.row.id)">删除</el-button>
                </template>
            </el-table-column>
        </el-table>

        <!-- 分页 -->
        <el-pagination
            :current-page="page"    
            :page-size="limit"
            :total="total"
            style="padding: 30px 0; text-align: center;"
            layout="total, prev, pager, next, jumper"
            @current-change="getList"
        />

    </div>
</template>

<script>
import user from '@/api/user'

export default {
    data() {
        return {
            list: null,        //查询之后接口返回集合
            page: 1,           //当前页
            limit: 5,          //每页显示的记录数
            total: 0,          //总记录数
            userQuery: {},     //条件封装对象
            listLoading: true, //表格加载标志
        }
    },

    created() { 
        this.getList()
    },

    methods: {  
        //获取用户列表
        getList(page = 1) {
            this.page = page
            this.listLoading = true
            user.getUserListPageAPI(this.page, this.limit, this.userQuery)
                .then(response => { 
                    console.log(response)
                    this.list = response.data.rows
                    this.total = response.data.total
                    this.listLoading = false
                })
        },

        //清空查询条件的方法
        resetData() {
            this.userQuery = {}  //表单输入项数据清空
            this.getList()          //查询所有用户数据
        },

        //删除用户
        removeUser(id) {
            this.$confirm('此操作将永久删除该用户, 是否继续?', '提示', {
                confirmButtonText: '确定',
                cancelButtonText: '取消',
                type: 'warning'
            }).then(() => {
                //调用删除方法
                user.deleteUserAPI(id)
                    .then(response => {
                        //提示信息
                        this.$message({
                            type: 'success',
                            message: '删除成功!'
                        })
                        //回到页表页面，重新刷新
                        this.getList()
                    })
                    .catch(error => {
                        console.log(error)
                    })
            })
        },

        //注销用户
        disableUser(id, isDisabled) {
            if(isDisabled) {
                this.$confirm('此操作将恢复该用户, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    user.disableUserAPI(id)
                        .then(response => {
                            //提示信息
                            this.$message({
                                type: 'success',
                                message: '恢复成功!'
                            })
                            //回到页表页面，重新刷新
                            this.getList()
                        })
                })
            }
            else {
                this.$confirm('此操作将注销该用户, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    user.disableUserAPI(id)
                        .then(response => {
                            //提示信息
                            this.$message({
                                type: 'success',
                                message: '注销成功!'
                            })
                            //回到页表页面，重新刷新
                            this.getList()
                        })
                    })
            }
        }
    }
}
</script>