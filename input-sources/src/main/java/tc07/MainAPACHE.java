/* Copyright (C) 2021 Reinhardt Wenzina

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/

package tc07;



import de.tdosca.src.common.SpecialFormatBSD;
import de.tdosca.src.common.SpecialFormatMIT;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class MainAPACHE {
    public static void main(String[] args) {
        String s="[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
        Object obj= JSONValue.parse(s);
        JSONArray array=(JSONArray)obj;
        System.out.println("======the 2nd element of array======");
        System.out.println(array.get(1));
        System.out.println();

        System.out.println(SpecialFormatBSD.condensed("Hallo Hallo!"));

        System.out.println("de.tdosca.tc07.Main: 'hello'.");
    }
}
