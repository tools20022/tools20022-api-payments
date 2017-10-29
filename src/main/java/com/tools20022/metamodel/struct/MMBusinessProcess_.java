/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMBusinessTransaction;
import com.tools20022.metamodel.struct.MMTopLevelCatalogueEntry_;
import java.util.List;

public interface MMBusinessProcess_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * specifies the BusinessProcess that is extending another BusinessProcess
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> extender = newAttribute();
	/**
	 * specifies the BusinessProcess that is extended by another BusinessProcess
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> extended = newAttribute();
	/**
	 * specifies the BusinessProcess that is included by another BusinessProcess
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> included = newAttribute();
	/**
	 * specifies the BusinessProcess that is incuding another BusinessProcess
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> includer = newAttribute();
	/**
	 * the BusinessRole that plays a role in BusinessProcess that owns it.
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessRole>> businessRole = newAttribute();
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessTransaction>> businessProcessTrace = newAttribute();
}