<template>
  <div class="side-contanier">
    <b-nav vertical>
      <b-nav-item :to="{path: '/'}">Home</b-nav-item>
      <b-nav-item :to="{path: '/todolist'}">Todo List</b-nav-item>
      <b-nav-item :to="{path: '/calendar'}">Calendar</b-nav-item>
    </b-nav>
  </div>
</template>

<script>
  export default {
    name: "SideBar.vue"
  }
</script>

<style scoped>
.side-contanier {
  height : 100%;
  background-color: rgb(247, 246, 243);
}
</style>
