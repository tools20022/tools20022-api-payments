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
import com.tools20022.repository.codeset.SafekeepingPlaceCode;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organisation used as the safekeeping place for the securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SafekeepingPlace" src="doc-files/SafekeepingPlace.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SafekeepingPlaceType
 * SafekeepingPlace.SafekeepingPlaceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace#Country
 * SafekeepingPlace.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#RelatedSecuritiesAccount
 * SafekeepingPlace.RelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesBalance
 * SafekeepingPlace.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesSettlement
 * SafekeepingPlace.SecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryForSafekeepingPlace
 * Country.CountryForSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SafekeepingPlace
 * SecuritiesAccount.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RequestedSafekeepingPlace
 * SecuritiesSettlement.RequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SafekeepingPlace
 * SecuritiesBalance.SafekeepingPlace}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
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
 * "SafekeepingPlace"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation used as the safekeeping place for the securities."</li>
 * </ul>
 */
public class SafekeepingPlace extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Place of safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
	 * SafekeepingPlaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SafekeepingPlaceType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlaceType";
			definition = "Place of safekeeping.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlaceCode.mmObject();
		}
	};
	/**
	 * Country where the financial instruments are/will be safekept.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#CountryForSafekeepingPlace
	 * Country.CountryForSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country where the financial instruments are/will be safekept."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = true;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country where the financial instruments are/will be safekept.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.CountryForSafekeepingPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account at the safekeeping place where financial instruments are
	 * safekept.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SafekeepingPlace
	 * SecuritiesAccount.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account at the safekeeping place where financial instruments are safekept."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesAccount";
			definition = "Account at the safekeeping place where financial instruments are safekept.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.SafekeepingPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance which is held at a safekeeping place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SafekeepingPlace
	 * SecuritiesBalance.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance which is held at a safekeeping place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Balance which is held at a safekeeping place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SafekeepingPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the settlement operation which uses the safekeeping place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RequestedSafekeepingPlace
	 * SecuritiesSettlement.RequestedSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement operation which uses the safekeeping place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Specifies the settlement operation which uses the safekeeping place.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.RequestedSafekeepingPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlace";
				definition = "Organisation used as the safekeeping place for the securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.CountryForSafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.SafekeepingPlace,
						com.tools20022.repository.entity.SecuritiesSettlement.RequestedSafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.SafekeepingPlace);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.SafekeepingPlace.SafekeepingPlaceType, com.tools20022.repository.entity.SafekeepingPlace.Country, com.tools20022.repository.entity.SafekeepingPlace.RelatedSecuritiesAccount,
								com.tools20022.repository.entity.SafekeepingPlace.SecuritiesBalance, com.tools20022.repository.entity.SafekeepingPlace.SecuritiesSettlement);
			}
		});
		return mmObject_lazy.get();
	}
}