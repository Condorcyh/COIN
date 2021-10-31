import request from '@/utils/request'

export default {
    getUserListPageAPI(current, limit, userQuery) {
        return request({
            url: `/userservice/users/getUserListPage/${current}/${limit}`,
            method: 'post',
            data: userQuery
        })
    },
    
    deleteUserAPI(id) {
        return request({
            url: `/userservice/users/deleteUser/${id}`,
            method: 'delete',
        })
    },
    
    getUserInfoAPI(id) {
        return request({
            url: `/userservice/users/getUserInfo/${id}`,
            method: 'get',
        })
    },
    
    updateUserInfoAdminAPI(userInfo) {
        return request({
            url: `/userservice/users/updateUserInfoAdmin`,
            method: 'post',
            data: userInfo
        })
    },
    
    addUserAPI(userInfo) {
        return request({
            url: `/userservice/users/addUser`,
            method: 'post',
            data: userInfo
        })
    },

    disableUserAPI(id) {
        return request({
            url: `/userservice/users/disableUser/${id}`,
            method: 'get'
        })
    }
}


