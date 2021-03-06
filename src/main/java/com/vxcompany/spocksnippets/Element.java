package com.vxcompany.spocksnippets;

// This file is part of SpockSnippets.
//
// SpockSnippets is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// SpockSnippets is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with SpockSnippets.  If not, see <http://www.gnu.org/licenses/>.

/**
 * @author Michel Vollebregt
 */
public class Element {

    private String name;

    public Element(String name) {
         if (name == null) throw new NullPointerException();
         this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Element)) return false;
        return name.equals(((Element) obj).getName());
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name;
    }
}
