/*
 * Copyright 2022 Storebrand ASA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.storebrand.healthcheck;

/**
 * Defines the "team" that should be the first to inspect a status check that fails.
 *
 * @author Kristian Hiim, 2021-2022 kristian@hiim.no
 * @author Endre Stølsvik, 2021-2022 endre@stolsvik.com
 * @author Hallvard Nygård, Knut Saua Mathiesen, Endre Stølsvik, Dag Lennart Bertelsen, Kevin Mc Tiernan 2014-2021: former ServerStatus-solution and discussions/input
 */
public enum Responsible {
    /**
     * Probably a code problem, or corner case, which developers needs to look into.
     */
    DEVELOPERS,

    /**
     * Probably some server that is down, slow network, or similar, which operations must look into.
     */
    OPERATIONS,

    /**
     * "Inner workings" of a company/department, e.g. problem with settling of orders or similar.
     * <p/>
     * https://en.wikipedia.org/wiki/Back_office
     */
    BACK_OFFICE,

    /**
     * "Customer facing" of a company/department, e.g. some customer info is wrongly entered or similar.
     * <p/>
     * https://en.wikipedia.org/wiki/Front_office
     */
    FRONT_OFFICE
}
