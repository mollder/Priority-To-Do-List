<template>
  <div class="side-contanier">
    <b-nav vertical class="side-bar">
      <b-nav-item :to="{path: '/'}" class="item1"><span>Home</span></b-nav-item>
      <b-nav-item :to="{path: '/todolist'}" class="item2"><span>Todo List</span></b-nav-item>
      <b-nav-item :to="{path: '/calendar'}" class="item3"><span>Calendar</span></b-nav-item>
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
  width: 100%;
  text-align: center;
}
.side-bar {
  width: 100%;
}
span {
  color: rgba(25, 23, 17, 0.6);
}
.item1:hover {
 background-color: rgba(55, 53, 47, 0.08);
}
.item2:hover {
  background-color: rgba(55, 53, 47, 0.08);
}
.item3:hover {
  background-color: rgba(55, 53, 47, 0.08);
}
.item1 {
  width: 100%;
}
.item2 {
  width: 100%;
}
.item3 {
  width: 100%;
}
ul {
  margin-block-start: 0em;
  margin-block-end: 0em;
  padding-inline-start: 0px;
}
</style>
