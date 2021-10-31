<template> 
    <div class="app-container"> 
        <el-form label-width="120px"> 
            <el-form-item label="用户名称"> 
                <el-input v-model="userInfo.nickname"/>
            </el-form-item> 

            <el-form-item label="手机号码"> 
                <el-input v-model="userInfo.mobile"/>
            </el-form-item> 

            <el-form-item label="密码" v-if="!userInfo.id"> 
                <el-input v-model="userInfo.password"/>
            </el-form-item> 
            
            <el-form-item label="用户等级"> 
                <el-select v-model="userInfo.level" clearable placeholder="请选择">
                    <!-- 数据类型一定要和取出的json中的一致，否则没法回填，因此，这里value使用动态绑定的值，保证其数据类型是number -->
                    <el-option :value="1" label="普通用户"/>
                    <el-option :value="2" label="高级用户"/>
                </el-select>
            </el-form-item> 
            
            <el-form-item label="用户签名"> 
                <el-input v-model="userInfo.sign" :rows="10" type="textarea"/>
            </el-form-item>
            
            <el-form-item label="用户头像">
                <pan-thumb :image="userInfo.avatar"/>
                <!-- 文件上传按钮 -->
                <el-button type="primary" icon="el-icon-upload" @click="imagecropperShow=true">更换头像</el-button>
                
                <image-cropper
                    v-show="imagecropperShow"
                    :width="300"
                    :height="300"
                    :key="imagecropperKey"
                    :url="'http://106.15.93.81:9001/ossservice/fileoss'"
                    field="file"
                    @close="close"
                    @crop-upload-success="cropSuccess"/>

            </el-form-item>

            <el-form-item> 
                <el-button :disabled="saveBtnDisabled" type="primary" @click="saveOrUpdate">保存</el-button>
            </el-form-item>
        </el-form>
    </div>
</template>

<script>
import user from '@/api/user'
import ImageCropper from '@/components/ImageCropper'
import PanThumb from '@/components/PanThumb'

export default {
    components: { ImageCropper, PanThumb },

    data() {
        return {
            userInfo: {
                nickname: '',
                password: '',
                mobile: '',
                level: 1,
                sign: '',
                avatar: ''
            },

            //上传弹框组件是否显示
            imagecropperShow: false,

            //上传组件key值
            imagecropperKey: 0,

            //获取dev.env.js中的接口API地址
            BASE_API: process.env.BASE_API,

            //保存按钮是否禁用
            saveBtnDisabled: false   
        }
    },

    created() {
        this.init()
    },

    //监听
    watch: {
        $route(to, from) {   //路由变化方式，路由发生变化，方法就会执行
            this.init()
        }
    },

    methods: {
        init() {
            //判断路径是否有id值，有的话就是修改界面，要做数据回显
            if (this.$route.params && this.$route.params.id) {
                //从路径获取id
                const id = this.$route.params.id
                //调用根据id查询的方法
                this.getInfo(id)
            }
            else {
                //路径没有id值，即要添加
                //清空表单
                this.userInfo = {}
            }
        },

        //根据用户id查询方法
        getInfo(id) {
            user.getUserInfoAPI(id)
                .then(response => {
                    this.userInfo = response.data.userInfo
                })
        },

        saveOrUpdate() {
            //判断是修改还是添加
            if(this.userInfo.id) {   //如果有id
                this.updateUser()
            }
            else {
                this.saveUser()
            }
        },

        //添加用户的方法
        saveUser() {
            user.addUserAPI(this.userInfo)
                .then(response => {
                    //提示信息
                    this.$message({
                        type: 'success',
                        message: '添加成功!'
                    })

                    //回到列表页面 路由跳转
                    this.$router.push({ path:'/user/table' })
                })
        },

        //修改用户的方法
        updateUser() {
            user.updateUserInfoAdminAPI(this.userInfo)
                .then(response => {
                    this.$message({
                        type: 'success',
                        message: '修改成功!'
                    })
                })

                this.$router.push({ path:'/user/table' })
        },

        //关闭上传弹框的方法
        close() {
            this.imagecropperShow = false
            //上传组件初始化
            this.imagecropperKey = this.imagecropperKey + 1
        },

        //上传成功的方法
        cropSuccess(data) {
            this.imagecropperShow = false
            //上传之后接口返回图片地址
            this.userInfo.avatar = data.url
            //上传组件初始化
            this.imagecropperKey = this.imagecropperKey + 1
        }
    }
}
</script>