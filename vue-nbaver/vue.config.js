const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,
  // outputDir: "../src/main/resources/static",
  // devServer: {
  //   proxy: {
  //     "/server": {
  //       target: "http://localhost:2306",
  //       changeOrigin: true,
  //     },
  //   },
  // },
});
