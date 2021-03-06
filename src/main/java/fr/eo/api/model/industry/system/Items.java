/*
 * Copyright (C) 2014 Picon software
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package fr.eo.api.model.industry.system;

import fr.eo.api.model.industry.SolarSystem;

import java.util.List;

public class Items {
    private SolarSystem solarSystem;
    private List<SystemCostIndices> systemCostIndices;

    public SolarSystem getSolarSystem() {
        return this.solarSystem;
    }

    public void setSolarSystem(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }

    public List<SystemCostIndices> getSystemCostIndices() {
        return this.systemCostIndices;
    }

    public void setSystemCostIndices(List<SystemCostIndices> systemCostIndices) {
        this.systemCostIndices = systemCostIndices;
    }
}
