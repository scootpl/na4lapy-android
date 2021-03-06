/*
 *	Copyright 2017 Stowarzyszenie Na4Łapy
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *	http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package pl.kodujdlapolski.na4lapy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@DatabaseTable(tableName = "shelters")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor //for ormlite
public class Shelter extends BaseEntity implements Serializable {

    @DatabaseField
    private String name;

    @DatabaseField
    private String street;

    @DatabaseField
    private String buildingNumber;

    @DatabaseField
    private String city;

    @DatabaseField
    private String postalCode;

    @DatabaseField
    private String email;

    @DatabaseField
    private String phoneNumber;

    @DatabaseField
    private String website;

    @DatabaseField
    private String accountNumber;

    @DatabaseField
    private String adoptionRules;
}
