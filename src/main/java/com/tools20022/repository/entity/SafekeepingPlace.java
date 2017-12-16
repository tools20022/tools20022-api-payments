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
import com.tools20022.repository.codeset.SafekeepingPlaceCode;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSafekeepingPlaceType
 * SafekeepingPlace.mmSafekeepingPlaceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmCountry
 * SafekeepingPlace.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmRelatedSecuritiesAccount
 * SafekeepingPlace.mmRelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesBalance
 * SafekeepingPlace.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesSettlement
 * SafekeepingPlace.mmSecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForSafekeepingPlace
 * Country.mmCountryForSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
 * SecuritiesAccount.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRequestedSafekeepingPlace
 * SecuritiesSettlement.mmRequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSafekeepingPlace
 * SecuritiesBalance.mmSafekeepingPlace}</li>
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
 * "SafekeepingPlace"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation used as the safekeeping place for the securities."</li>
 * </ul>
 */
public class SafekeepingPlace extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SafekeepingPlaceCode safekeepingPlaceType;
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
	public static final MMBusinessAttribute mmSafekeepingPlaceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlaceType";
			definition = "Place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlaceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SafekeepingPlace.class.getMethod("getSafekeepingPlaceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Country country;
	/**
	 * Country where the financial instruments are/will be safekept.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForSafekeepingPlace
	 * Country.mmCountryForSafekeepingPlace}</li>
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
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			isDerived = true;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country where the financial instruments are/will be safekept.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmCountryForSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected SecuritiesAccount relatedSecuritiesAccount;
	/**
	 * Account at the safekeeping place where financial instruments are
	 * safekept.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
	 * SecuritiesAccount.mmSafekeepingPlace}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesAccount";
			definition = "Account at the safekeeping place where financial instruments are safekept.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected SecuritiesBalance securitiesBalance;
	/**
	 * Balance which is held at a safekeeping place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSafekeepingPlace
	 * SecuritiesBalance.mmSafekeepingPlace}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Balance which is held at a safekeeping place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * Specifies the settlement operation which uses the safekeeping place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRequestedSafekeepingPlace
	 * SecuritiesSettlement.mmRequestedSafekeepingPlace}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Specifies the settlement operation which uses the safekeeping place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmRequestedSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlace";
				definition = "Organisation used as the safekeeping place for the securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmCountryForSafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.mmSafekeepingPlace,
						com.tools20022.repository.entity.SecuritiesSettlement.mmRequestedSafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.mmSafekeepingPlace);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SafekeepingPlace.mmSafekeepingPlaceType, com.tools20022.repository.entity.SafekeepingPlace.mmCountry,
						com.tools20022.repository.entity.SafekeepingPlace.mmRelatedSecuritiesAccount, com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesBalance,
						com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SafekeepingPlace.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SafekeepingPlaceCode getSafekeepingPlaceType() {
		return safekeepingPlaceType;
	}

	public void setSafekeepingPlaceType(SafekeepingPlaceCode safekeepingPlaceType) {
		this.safekeepingPlaceType = safekeepingPlaceType;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.entity.Country country) {
		this.country = country;
	}

	public SecuritiesAccount getRelatedSecuritiesAccount() {
		return relatedSecuritiesAccount;
	}

	public void setRelatedSecuritiesAccount(com.tools20022.repository.entity.SecuritiesAccount relatedSecuritiesAccount) {
		this.relatedSecuritiesAccount = relatedSecuritiesAccount;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return securitiesBalance;
	}

	public void setSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance securitiesBalance) {
		this.securitiesBalance = securitiesBalance;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}
}