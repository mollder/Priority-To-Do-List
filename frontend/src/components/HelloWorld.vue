<template>
  <div class="hello">
    <div class="row">
      <SideBar class="col-2"></SideBar>
      <AppMain class="col-10"></AppMain>
    </div>
  </div>
</template>

<script>
import SideBar from './SideBar.vue';
import AppMain from './AppMain.vue';

export default {
  name: 'HelloWorld',
  components : {
    SideBar,
    AppMain
  },
  data() {
    return {
      msg: 'Welcome to Your Vue.js App',
    };
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
