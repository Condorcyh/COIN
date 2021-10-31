import request from '@/utils/request'

export default {
    getDomainListPageAPI(current, limit, domainQuery) {
        return request({
            url: `/coinservice/domain/getDomainListPage/${current}/${limit}`,
            method: 'post',
            data: domainQuery
        })
    },

    deleteDomainAPI(domainId) {
        return request({
            url: `/coinservice/domain/deleteDomain/${domainId}`,
            method: 'delete'
        })
    }

}
