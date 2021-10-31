import request from '@/utils/request'

export function login(username, password) {
  return request({
    url: '/userservice/admin/login',
    // url: '/coinservice/admin/login',
    method: 'post',
    data: {
      username,
      password
    }
  })
}

export function getInfo(token) {
  return request({
    url: '/userservice/admin/info',
    // url: '/coinservice/admin/info',
    method: 'get',
    params: { token }
  })
}

export function logout() {
  return request({
    url: '/userservice/admin/logout',
    // url: '/coinservice/admin/logout',
    method: 'post'
  })
}
