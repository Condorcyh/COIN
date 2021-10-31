'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  BASE_API: '"http://106.15.93.81:9001"',
  // BASE_API: '"http://localhost:8002"',
})
