<template>
  <div class="todo-list">
    <p>처리 목록</p>

    <ul>
      <li v-for="todo in todoLists" v-bind:key="todo.priority">
        <b-row>
        <b-col cols = "1"><span class="priority"> {{todo.priority}}.</span></b-col>
        <b-col cols = "8"><span class="title">   {{todo.title}} - {{ todo.summary }} </span></b-col>
        <b-col><span class="D-day"> D-day : {{ todo.dday }} </span></b-col>
        </b-row>
      </li>
    </ul>
  </div>
</template>

<script>
    import axios from 'axios';

    export default {
        name: "ToDoList",
        data: function () {
          return {
            todoLists: [],
          };
        },
        created() {
          this.getTodoLists();
        },
        methods: {
          getTodoLists() {
            axios({
              method: 'get',
              url : './todoLists',
            }).then(response => {
              this.todoLists = response.data;
            });
          }
        }
    }
</script>

<style scoped>
p {
  font-size: 2.375em;
  color: rgba(25, 23, 17, 0.6);
  padding-bottom: 25px;
  border-bottom: 1px solid rgba(25, 23, 17, 0.6);
}

ul {
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol";
  line-height: 1.5;
}

li {
  margin-bottom: 20px;
  color: inherit;
  padding-top: 5px;
  padding-bottom: 5px;
}

li:hover {
  background-color: rgba(55, 53, 47, 0.08);
}

.title {
  /*border-bottom: 1px solid rgba(25, 23, 17, 0.16);*/
}

.todo-list {
  padding: 50px 50px 96px 96px;
}

</style>
