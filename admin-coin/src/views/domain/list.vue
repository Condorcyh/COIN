<template>
    <div class="app-container">
        <!--查询表单-->
        <el-form :inline="true" class="demo-form-inline"> 
            <el-form-item> 
                <el-input v-model="domainQuery.name" placeholder="图谱名称"/>
            </el-form-item> 

            <el-form-item> 
                <el-input v-model="domainQuery.userId" placeholder="所属用户id"/>
            </el-form-item> 
            
            <el-form-item label="添加时间"> 
                <el-date-picker
                    v-model="domainQuery.begin"
                    type="datetime"
                    placeholder="选择开始时间"
                    value-format="yyyy-MM-dd HH:mm:ss"
                    default-time="00:00:00"
                />
            </el-form-item> 
            
            <el-form-item> 
                <el-date-picker
                    v-model="domainQuery.end"
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
            
            <el-table-column prop="name" label="图谱名称" width="250" />

            <el-table-column prop="user_id" label="所属用户id" width="250"/>
            
            <el-table-column prop="createTime" label="添加时间" width="250"/>

            <el-table-column prop="modifyTime" label="修改时间" width="250"/>

            <el-table-column label="操作" width="300" align="center"> 
                <template slot-scope="scope"> 
                    <el-button type="danger" size="mini" icon="el-icon-delete" @click="removeDomain(scope.row.id)">删除</el-button>
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
import domain from '@/api/domain'

export default {
    data() {
        return {
            list: null,        //查询之后接口返回集合
            page: 1,           //当前页
            limit: 5,          //每页显示的记录数
            total: 0,          //总记录数
            domainQuery: {},     //条件封装对象
            listLoading: true, //表格加载标志
        }
    },

    created() { 
        this.getList()
        this.listLoading = false
    },

    methods: {  
        //获取用户列表
        getList(page = 1) {
            this.page = page
            domain.getDomainListPageAPI(this.page, this.limit, this.domainQuery)
                .then(response => { 
                    console.log(response)
                    this.list = response.data.rows
                    this.total = response.data.total
                    console.log(this.list)
                    console.log(this.total)
                })
        },

        //清空查询条件的方法
        resetData() {
            this.domainQuery = {}  //表单输入项数据清空
            this.getList()          //查询所有用户数据
        },

        //删除图谱
        removeDomain(id) {
            this.$confirm('此操作将永久删除该图谱, 是否继续?', '提示', {
                confirmButtonText: '确定',
                cancelButtonText: '取消',
                type: 'warning'
            }).then(() => {
                //调用删除方法
                domain.deleteDomainAPI(id)
                    .then(response => {
                        //提示信息
                        this.$message({
                            type: 'success',
                            message: '删除成功!'
                        })
                        //回到页表页面，重新刷新
                        this.getList()
                    })
            })
        },

    }
}
</script>