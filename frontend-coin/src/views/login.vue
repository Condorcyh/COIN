<template>
    <div class="login-container">
        <div class="login-box">
            <div class="login-title">
                <img src="../assets/welcome.png">
            </div>
            <el-form :model="form" class="login-form">
                <div class="inputBox">
                    <el-form-item>
                        <el-input v-model="form.mobile"
                                  prefix-icon="el-icon-mobile-phone"
                                  placeholder="请输入手机号"
                        ></el-input>
                    </el-form-item>
                    <span class="promptMsg" id="userMsg">请输入正确格式的手机号</span>
                </div>
                <div class="inputBox">
                    <el-form-item>
                        <el-input v-model="form.password"
                                  prefix-icon="el-icon-lock"
                                  placeholder="请输入密码"
                                  type="password"
                        ></el-input>
                    </el-form-item>
                    <span class="promptMsg" id="pwdMsg">请输入密码</span>
                </div>
                <el-button type="primary" class="login-btn" @click="handleLogin" style="width: 100%; margin-bottom: 10px"
                           :loading="loginLoading"
                >登录</el-button>
                <div class="login-choice">
                    <router-link to="/register">没有账号？立即注册</router-link>
<!--                    <a href="Register">没有账号？立即注册</a>-->
                    <span @click="forgetPwd">忘记密码</span>
                </div>
            </el-form>
        </div>
        <reset-pwd-dialog></reset-pwd-dialog>
    </div>
</template>

<script>
    import {mapActions, mapGetters, mapMutations} from "vuex";
    import ResetPwdDialog from "./user/resetPwdDialog";


    export default {
        name: "login",
        components: {ResetPwdDialog},
        data(){
            return{
                form:{
                    mobile:'',
                    password:'',
                },
                loginLoading: false,
                resetPwdForm:{
                    mobile:'',
                    password:'',
                }
            }
        },
        computed:{
            ...mapGetters([
                'userInfo',
                'isLogin',
                'resetPwdDialogVisible'
            ])
        },
        watch: {
            $route: {
                handler: function(route) {
                    this.redirect = route.query && route.query.redirect
                },
                immediate: true
            },
        },
        methods: {
            ...mapMutations([
                'set_resetPwdDialogVisible'
            ]),
            ...mapActions([
                'login'
            ]),
            handleLogin() {
                if (this.checkUser() && this.checkPwd()) {
                    this.loginLoading = true;
                    this.login(this.form);
                    this.loginLoading = false;
                    this.form = {
                        mobile: '',
                        password: '',
                    }
                } else {
                    this.checkUser();
                    this.checkPwd();
                }
            },
            checkUser(){
                //正则表达式检验邮箱/手机号格式
                var user = this.form.mobile.trim(); // 获取字段值
                var reg1 = /^\w+@[a-zA-Z0-9]{2,10}(?:\.[a-z]{2,4}){1,3}$/;
                var reg2 = /^[1][3,4,5,7,8][0-9]{9}$/;
                if(reg1.test(user)||reg2.test(user)){
                    document.getElementById("userMsg").style.display = "none";
                    return true;
                }else{
                    document.getElementById("userMsg").style.display = "inline";
                    return false;
                }
            },
            checkPwd(){
                var pwd = this.form.password.trim();  // 获取字段值
                pwd = pwd.replace(/(^\s*)|(\s*$)/g, '');
                if(pwd == '' || pwd == undefined || pwd == null){
                    document.getElementById("pwdMsg").style.display = "inline";
                    return false;
                }else{
                    document.getElementById("pwdMsg").style.display = "none";
                    return true;
                }
            },
            forgetPwd(){
                console.log("reset")
                this.set_resetPwdDialogVisible(true)
            },
        }
    }
</script>

<style scoped>
    .login-container{
        /*absolute而不是fixed，否则对话框弹出整个页面会变灰*/
        position: absolute;
        top: 0;
        left: 0;
        bottom: 0;
        right: 0;
        width: 100%;
        height: 100%;
        background-size: 100% 100%;
        background-image: url("../assets/kg-background3.jpg");
    }
    .login-box{
        background-color: white;
        position: absolute;
        display: flex;
        flex-direction: column;
        left: 50%;
        top: 50%;
        transform: translate(-50%,-50%);
        width: 33%;
        min-width: 300px;
        /*height: 51.7%;*/
        /*min-height: 300px;*/
        max-height: 400px;
        border-radius: 15px;
        box-shadow:0 0 10px gray;
    }
    .login-title{
        width: 100%;
        height: 20%;
        line-height: 20%;
        /*text-align: center;*/
        display: flex;
        align-items: center;
        justify-content: center;
        /*margin-top: 15px;*/
        margin-top: 3.8%;
        margin-bottom: 4%;
    }
    .login-title img{
        width: 50%;
        min-height: 60%;
        /*height: 90%;*/
    }
    .login-form{
        width: 91.1%;
        flex: 1;
        /*position: absolute;*/
        /*bottom: 0;*/
        /*padding: 0 20px;*/
        padding: 0 4.4%;
        /*display: flex;*/
        /*flex-direction: column;*/
        /*justify-content: space-between;*/
    }
    .inputBox{
        height: 14.6%;
        margin-bottom: 6%;
    }
    .el-form-item{
        margin-bottom: 0px;
    }
    .login-choice{
        display: flex;
        align-items: center;
        justify-content: space-between;
        width: 100%;
        margin-top: 2.5%;
        margin-bottom: 9.0%;
    }
    .login-choice a{
        font-size: 13px;
        text-decoration: none;
        color: gray;
    }
    .login-choice a:hover{
        color: #65acff;
    }
    .login-choice span{
        font-size: 13px;
        text-decoration: none;
        color: gray;
        cursor: pointer;
    }
    .login-choice span:hover{
        color: #65acff;
    }
    .promptMsg{
        line-height: 14px;
        color: #ff463f;
        font-size: 14px;
        display: none;
    }
</style>
