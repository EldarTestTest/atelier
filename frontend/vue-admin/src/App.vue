<template>
    <v-app>
        <!--<app-header></app-header>-->
        <sign-in></sign-in>
        <router-view/>
    </v-app>
</template>

<script>
    import AppHeader from '@/components/AppHeader'
    import SignIn from '@/components/SignIn'

    export default {
        components: {
            AppHeader,
            SignIn
        }
    }

</script>
