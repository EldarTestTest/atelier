<template>
    <v-content>
        <v-container fluid fill-height>
            <v-layout align-center justify-center>
                <v-flex md6 lg5 xl4>
                    <v-card>
                        <v-toolbar>
                            <v-toolbar-title>Atelier</v-toolbar-title>
                            <v-spacer></v-spacer>
                            <!--<v-toolbar-title>Sign In</v-toolbar-title>-->
                        </v-toolbar>
                        <v-card-text>
                            <v-alert :value="true" type="warning" color="grey">You've entered an invalid username or password!</v-alert>
                            <v-form>
                                <v-text-field prepend-icon="person" name="login" label="Login" type="text"
                                              color="black"></v-text-field>
                                <v-text-field prepend-icon="lock" name="password" label="Password" id="password"
                                              type="password" color="black"></v-text-field>
                            </v-form>
                        </v-card-text>
                        <v-card-actions>
                            <v-spacer></v-spacer>
                            <v-btn>LogIn</v-btn>
                        </v-card-actions>
                    </v-card>
                </v-flex>
            </v-layout>
        </v-container>
    </v-content>
</template>

<script>
    export default {
        name: "SingIn"
    }
</script>