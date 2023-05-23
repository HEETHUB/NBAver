const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,
  outputDir: "../src/main/resources/static",
  devServer: {
    proxy: {
      "/api": {
        target: "http://localhost:2306",
        changeOrigin: true,
      },
    },
  },
});
