package com.example.rocketreserver

import com.apollographql.apollo3.ApolloCall
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Mutation
import com.apollographql.apollo3.api.Query

val apolloClient = ApolloClient.Builder()
    .serverUrl("https://apollo-fullstack-tutorial.herokuapp.com/graphql")
    .build()

fun <D : Query.Data> query(query: Query<D>): ApolloCall<D> = apolloClient.query(query)

fun <D : Mutation.Data> mutation(mutation: Mutation<D>): ApolloCall<D> = apolloClient.mutation(mutation)