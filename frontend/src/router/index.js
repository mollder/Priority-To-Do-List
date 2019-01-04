import Vue from 'vue';
import Router from 'vue-router';
import Layout from '@/components/Layout';
import ToDoList from "../components/ToDoList";
import Calendar from "../components/Calendar";
import Home from "../components/Home";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Layout',
      component: Layout,
      children: [
        {
          path: '/',
          component: Home,
        },
        {
          path: '/todolist',
          component: ToDoList,
        },
        {
          path: '/calendar',
          component: Calendar,
        },
      ],
    },
  ],
});
