import Vue from 'vue'
import Router from 'vue-router'

// in development-env not use lazy-loading, because lazy-loading too many pages will cause webpack hot update too slow. so only in production use lazy-loading;
// detail: https://panjiachen.github.io/vue-element-admin-site/#/lazy-loading

Vue.use(Router)

/* Layout */
import Layout from '../views/layout/Layout'

/**
* hidden: true                   if `hidden:true` will not show in the sidebar(default is false)
* alwaysShow: true               if set true, will always show the root menu, whatever its child routes length
*                                if not set alwaysShow, only more than one route under the children
*                                it will becomes nested mode, otherwise not show the root menu
* redirect: noredirect           if `redirect:noredirect` will no redirect in the breadcrumb
* name:'router-name'             the name is used by <keep-alive> (must set!!!)
* meta : {
    title: 'title'               the name show in submenu and breadcrumb (recommend set)
    icon: 'svg-name'             the icon show in the sidebar,
  }
**/
export const constantRoutes = [
  { path: '/login', component: () => import('@/views/login/index'), hidden: true },
  { path: '/404', component: () => import('@/views/404'), hidden: true },

  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    name: '首页',
    hidden: true,
    children: [{
      path: 'dashboard',
      component: () => import('@/views/dashboard/index')
    }]
  },

  {
    path: '/user',
    component: Layout,
    redirect: '/user/table',
    name: '用户管理',
    meta: { title: '用户管理', icon: 'nested' },
    children: [
      {
        path: 'table',
        name: '用户列表',
        component: () => import('@/views/user/list'),
        meta: { title: '用户列表', icon: 'table' }
      },
      {
        path: 'create',
        name: '添加用户',
        component: () => import('@/views/user/modify'),
        meta: { title: '添加用户', icon: 'tree' }
      },
      {
        path: 'edit/:id',
        name: '编辑用户',
        component: () => import('@/views/user/modify'),
        meta: { title: '编辑用户', noCache: true },
        hidden: true
      }
    ]
  },

  {
    path: '/domain',
    component: Layout,
    redirect: '/domain/table',
    name: '图谱管理',
    meta: { title: '图谱管理', icon: 'nested' },
    children: [
      {
        path: 'table',
        name: '图谱列表',
        component: () => import('@/views/domain/list'),
        meta: { title: '图谱列表', icon: 'table' }
      }
    ]
  },

  {
    path: 'external-link',
    component: Layout,
    children: [
      {
        path: 'http://106.15.93.81:9001',
        meta: { title: '外部链接', icon: 'link' }
      }
    ]
  },

  { path: '*', redirect: '/404', hidden: true }
]

//动态路由
// export const asyncRoutes = [
//   {
//     path: '/user',
//     component: Layout,
//     redirect: '/user/table',
//     name: '用户管理',
//     meta: { title: '用户管理', icon: 'nested' },
//     children: [
//       {
//         path: 'table',
//         name: '用户列表',
//         component: () => import('@/views/user/list'),
//         meta: { title: '用户列表', icon: 'table' }
//       },
//       {
//         path: 'edit/:id',
//         name: '添加用户',
//         component: () => import('@/views/user/modify'),
//         meta: { title: '添加用户', icon: 'tree' }
//       }
//     ]
//   },
// ]

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

// export default new Router({
//   // mode: 'history', //后端支持可开
//   scrollBehavior: () => ({ y: 0 }),
//   routes: constantRouterMap
// })

export default router
