package com.module.jetpack.compose.data.impl.storage.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.module.jetpack.compose.common.domain.User

@Entity(tableName = "user_table")
data class StoredUser(
    @PrimaryKey
    @ColumnInfo(name = "id") override val id: Long,
    @ColumnInfo(name = "login") override val login: String,
    @ColumnInfo(name = "node_id") override val nodeId: String,
    @ColumnInfo(name = "avatar_url") override val avatarUrl: String,
    @ColumnInfo(name = "gravatar_id") override val gravatarId: String,
    @ColumnInfo(name = "url") override val url: String,
    @ColumnInfo(name = "html_url") override val htmlUrl: String,
    @ColumnInfo(name = "followers_url") override val followersUrl: String,
    @ColumnInfo(name = "following_url") override val followingUrl: String,
    @ColumnInfo(name = "gists_url") override val gistsUrl: String,
    @ColumnInfo(name = "starred_url") override val starredUrl: String,
    @ColumnInfo(name = "subscriptions_url") override val subscriptionsUrl: String,
    @ColumnInfo(name = "organizations_url") override val organizationsUrl: String,
    @ColumnInfo(name = "repos_url") override val reposUrl: String,
    @ColumnInfo(name = "events_url") override val eventsUrl: String,
    @ColumnInfo(name = "received_events_url") override val receivedEventsUrl: String,
    @ColumnInfo(name = "type") override val type: String,
    @ColumnInfo(name = "site_admin") override val siteAdmin: Boolean,
    @ColumnInfo(name = "score") override val score: Float,
    @ColumnInfo(name = "name") override val name: String,
    @ColumnInfo(name = "company") override val company: String,
    @ColumnInfo(name = "blog") override val blog: String,
    @ColumnInfo(name = "location") override val location: String,
    @ColumnInfo(name = "email") override val email: String,
    @ColumnInfo(name = "hireable") override val hireable: String,
    @ColumnInfo(name = "bio") override val bio: String,
    @ColumnInfo(name = "public_repos") override val publicRepos: Int,
    @ColumnInfo(name = "public_gists") override val publicGists: Int,
    @ColumnInfo(name = "followers") override val followers: Int,
    @ColumnInfo(name = "following") override val following: Int
) : User