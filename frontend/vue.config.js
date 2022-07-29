//const { defineConfig } = require('@vue/cli-service')
// module.exports = defineConfig({
//   transpileDependencies: [
//     'vuetify'
//   ],
//   lintOnSave: false
// })

module.exports = {
  devServer: {
    https: false,
    port: 8083,
    open: true,
    proxy: {
      '/api/v1': {
        target: 'http://localhost:8080/'
      }
    },
    historyApiFallback: true,
    hot: true
  },
  transpileDependencies: [
    'element-plus',
    'vuetify'
  ],
  lintOnSave: false,
  outputDir: '../backend/src/main/resources/dist'
}
