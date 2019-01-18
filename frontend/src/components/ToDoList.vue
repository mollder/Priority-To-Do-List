<template>
  <div class="todo-list">
    <p>처리 목록</p>

    <ul>
      <li v-for="todo in todoList" v-bind:key="todo.id">
        <b-row>
        <b-col cols = "1"><span class="priority"> {{todo.priority}}.</span></b-col>
        <b-col cols = "8"><span class="title">   {{todo.title}} - {{ todo.summary }} </span></b-col>
        <b-col><span class="D-day"> D-day : {{ todo.dDay }} </span></b-col>
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
            todoList: [
              {
                id : 1,
                priority : 1,
                title : 'skt 면접 준비',
                summary : '하루 뒤에 면접이 진행됩니다.',
                dDay: 1,
              },
              {
                id : 2,
                priority : 2,
                title : '쿠팡 코딩테스트',
                summary : '코딩테스트가 있습니다.',
                dDay: 3,
              },
              {
                id : 3,
                priority : 3,
                title : '결석 사유서 제출',
                summary : '결석에 관한 사유서를 제출해야 합니다.',
                dDay: 2,
              },
              {
                id : 4,
                priority : 4,
                title : '다음주 월요일 자바 시험',
                summary : '다음주 월요일에 자바 시험이 있습니다.',
                dDay: 5,
              },
            ]
          }
        },
        created() {
          this.getTodoLists();
        },
        methods: {
          getTodoLists() {
            axios({
              method: 'get',
              url : 'http://127.0.0.1:8081/todoLists',
            }).then(function (response) {
              this.todoList = response.data;
            })
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
