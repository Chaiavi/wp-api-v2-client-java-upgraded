package com.afrozaar.wordpress.wpapi.v2;

import com.afrozaar.wordpress.wpapi.v2.api.*;
import com.afrozaar.wordpress.wpapi.v2.request.SearchRequest;
import com.afrozaar.wordpress.wpapi.v2.response.PagedResponse;

import java.net.URI;
import java.util.function.Function;

public interface Wordpress extends Posts, Comments, PostMetas, Taxonomies, Terms, Medias, Pages, Users, Tags, Categories, CustomCalls {

    String getContext();

    <T> PagedResponse<T> getPagedResponse(String context, Class<T> typeRef, String... expandParams);

    <T> PagedResponse<T> getPagedResponse(URI uri, Class<T> typeRef);

    <T> PagedResponse<T> traverse(PagedResponse<T> response, Function<PagedResponse<?>, String> direction);

    <T> PagedResponse<T> search(SearchRequest<T> search);
}
