<template>
  <div class="todo-list">
    <p>To do list</p>

    <ul>
      <li>
        <span class="title">to do1</span>  <span class="D-day"> ( D-day : 3 left)</span>
      </li>
      <li>
        <span class="title">to do2</span>   <span class="D-day"> ( D-day : 3 left)</span>
      </li>
      <li>
        <span class="title">to do3</span>   <span class="D-day"> ( D-day : 3 left)</span>
      </li>
      <li>
        <span class="title">to do4</span>   <span class="D-day"> ( D-day : 3 left)</span>
      </li>
    </ul>
  </div>
</template>

<script>
    export default {
        name: "ToDoList"
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
  list-style: none;
  margin-bottom: 20px;
  color: inherit;
}

li:hover {
  background-color: rgba(55, 53, 47, 0.08);
}

.title {
  padding-top: 5px;
  padding-bottom: 5px;
  border-bottom: 1px solid rgba(25, 23, 17, 0.16);
}

.todo-list {
  padding: 50px 50px 96px 96px;
}

</style>
