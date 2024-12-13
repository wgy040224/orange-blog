<template>
  <!-- 设置语言为中文 -->
  <el-config-provider :locale="locale">
      <router-view></router-view>
   </el-config-provider>
</template>

<script setup>

import zhCn from 'element-plus/dist/locale/zh-cn.mjs'

const locale = zhCn

</script>

<style>
/* 自定义顶部加载 Loading 颜色 */
#nprogress .bar {
   background: #F06418!important;
}
/* 自定义右上角加载 Loading 颜色 */
#nprogress .spinner-icon {
  border-top-color: #F06418;
  border-left-color: #F06418;
}
/* 暗黑模式 body 背景色 */
.dark body {
   --tw-bg-opacity: 1;
    background-color: rgb(17 24 39 / var(--tw-bg-opacity));
}


</style>
