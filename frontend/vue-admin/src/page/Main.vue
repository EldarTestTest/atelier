<template>
    <div>
        <app-header></app-header>
        <v-content>
            <!--Тут будут views подаваться через роутер-->
        </v-content>
    </div>
</template>


<script>
    import AppHeader from '../components/AppHeader'

    export default {
        name: 'Main',
        components: {
            AppHeader
        }
    }
</script>