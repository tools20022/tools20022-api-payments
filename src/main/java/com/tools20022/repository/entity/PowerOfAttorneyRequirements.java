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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the conditions to be filled in to obtain a valid power of attorney.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PowerOfAttorneyRequirements"
 * src="doc-files/PowerOfAttorneyRequirements.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#LegalRequirement
 * PowerOfAttorneyRequirements.LegalRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#OtherDocumentation
 * PowerOfAttorneyRequirements.OtherDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#PowerOfAttorney
 * PowerOfAttorneyRequirements.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#Meeting
 * PowerOfAttorneyRequirements.Meeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#PowerOfAttorneyRequirements
 * Meeting.PowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#PowerOfAttorneyRequirements
 * PowerOfAttorney.PowerOfAttorneyRequirements}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PowerOfAttorneyRequirements"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions to be filled in to obtain a valid power of attorney."
 * </li>
 * </ul>
 */
public class PowerOfAttorneyRequirements {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the power of attorney needs to be validated by some
	 * authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode
	 * PowerOfAttorneyLegalisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements
	 * PowerOfAttorneyRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the power of attorney needs to be validated by some authority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LegalRequirement = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PowerOfAttorneyRequirements.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalRequirement";
			definition = "Specifies whether the power of attorney needs to be validated by some authority.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
		}
	};
	/**
	 * Specifies the documents needed to obtain a valid power of attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements
	 * PowerOfAttorneyRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the documents needed to obtain a valid power of attorney."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OtherDocumentation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PowerOfAttorneyRequirements.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherDocumentation";
			definition = "Specifies the documents needed to obtain a valid power of attorney.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Power of attorney for which the requirements are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#PowerOfAttorneyRequirements
	 * PowerOfAttorney.PowerOfAttorneyRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements
	 * PowerOfAttorneyRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Power of attorney for which the requirements are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PowerOfAttorneyRequirements.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney for which the requirements are provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.PowerOfAttorneyRequirements;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Meeting to which the power of attorney requirements apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#PowerOfAttorneyRequirements
	 * Meeting.PowerOfAttorneyRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements
	 * PowerOfAttorneyRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting to which the power  of attorney requirements apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PowerOfAttorneyRequirements.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting to which the power  of attorney requirements apply.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.PowerOfAttorneyRequirements;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorneyRequirements";
				definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.PowerOfAttorneyRequirements, com.tools20022.repository.entity.PowerOfAttorney.PowerOfAttorneyRequirements);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PowerOfAttorneyRequirements.LegalRequirement, com.tools20022.repository.entity.PowerOfAttorneyRequirements.OtherDocumentation,
						com.tools20022.repository.entity.PowerOfAttorneyRequirements.PowerOfAttorney, com.tools20022.repository.entity.PowerOfAttorneyRequirements.Meeting);
			}
		});
		return mmObject_lazy.get();
	}
}