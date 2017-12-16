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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmLegalRequirement
 * PowerOfAttorneyRequirements.mmLegalRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmOtherDocumentation
 * PowerOfAttorneyRequirements.mmOtherDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmPowerOfAttorney
 * PowerOfAttorneyRequirements.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmMeeting
 * PowerOfAttorneyRequirements.mmMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmPowerOfAttorneyRequirements
 * Meeting.mmPowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmPowerOfAttorneyRequirements
 * PowerOfAttorney.mmPowerOfAttorneyRequirements}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected PowerOfAttorneyLegalisationCode legalRequirement;
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
	public static final MMBusinessAttribute mmLegalRequirement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalRequirement";
			definition = "Specifies whether the power of attorney needs to be validated by some authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PowerOfAttorneyRequirements.class.getMethod("getLegalRequirement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text otherDocumentation;
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
	public static final MMBusinessAttribute mmOtherDocumentation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherDocumentation";
			definition = "Specifies the documents needed to obtain a valid power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PowerOfAttorneyRequirements.class.getMethod("getOtherDocumentation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PowerOfAttorney powerOfAttorney;
	/**
	 * Power of attorney for which the requirements are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmPowerOfAttorneyRequirements
	 * PowerOfAttorney.mmPowerOfAttorneyRequirements}</li>
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
	public static final MMBusinessAssociationEnd mmPowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney for which the requirements are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmPowerOfAttorneyRequirements;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Meeting> meeting;
	/**
	 * Meeting to which the power of attorney requirements apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmPowerOfAttorneyRequirements
	 * Meeting.mmPowerOfAttorneyRequirements}</li>
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
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting to which the power  of attorney requirements apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmPowerOfAttorneyRequirements;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorneyRequirements";
				definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmPowerOfAttorneyRequirements, com.tools20022.repository.entity.PowerOfAttorney.mmPowerOfAttorneyRequirements);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmLegalRequirement, com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmOtherDocumentation,
						com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmPowerOfAttorney, com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmMeeting);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PowerOfAttorneyRequirements.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PowerOfAttorneyLegalisationCode getLegalRequirement() {
		return legalRequirement;
	}

	public void setLegalRequirement(PowerOfAttorneyLegalisationCode legalRequirement) {
		this.legalRequirement = legalRequirement;
	}

	public Max350Text getOtherDocumentation() {
		return otherDocumentation;
	}

	public void setOtherDocumentation(Max350Text otherDocumentation) {
		this.otherDocumentation = otherDocumentation;
	}

	public PowerOfAttorney getPowerOfAttorney() {
		return powerOfAttorney;
	}

	public void setPowerOfAttorney(com.tools20022.repository.entity.PowerOfAttorney powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
	}

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<com.tools20022.repository.entity.Meeting> meeting) {
		this.meeting = meeting;
	}
}