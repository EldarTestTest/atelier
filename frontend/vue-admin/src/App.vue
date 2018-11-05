<template>
    <v-app>
        <app-header></app-header>
        <router-view/>
    </v-app>
</template>

<script>
    import AppHeader from '@/components/AppHeader'

    export default {
        components: {
            AppHeader
        }
    }

</script>
