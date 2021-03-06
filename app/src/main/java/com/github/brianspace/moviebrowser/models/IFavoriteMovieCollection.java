/*
 * Copyright (C) 2018, Brian He
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.brianspace.moviebrowser.models;

import android.support.annotation.NonNull;
import io.reactivex.Single;

/**
 * Interface for favorite movie list.
 */
public interface IFavoriteMovieCollection extends IMovieCollection {

    /**
     * Add the movie to favorites.
     *
     * @param movie the movie model.
     * @return RxJava {@code Single} result.
     */
    @NonNull
    Single<Boolean> addToFavorite(@NonNull final Movie movie);


    /**
     * Remove the movie from favorites.
     *
     * @param movie the movie model.
     * @return RxJava {@code Single} result.
     */
    @NonNull
    Single<Boolean> removeFromFavorite(@NonNull final Movie movie);
}
