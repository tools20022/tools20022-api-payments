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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CardPaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentContext3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Party entitled by a card issuer to use a card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardholderRole" src="doc-files/CardholderRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardholderRole#mmAuthentication
 * CardholderRole.mmAuthentication}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmCardholder
 * Authentication.mmCardholder}</li>
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
 * "CardholderRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party entitled by a card issuer to use a card."</li>
 * </ul>
 */
public class CardholderRole extends CardPaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Authentication> authentication;
	/**
	 * Data related to the authentication of the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmCardholder
	 * Authentication.mmCardholder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmAuthenticationMethod
	 * PaymentContext3.mmAuthenticationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to the authentication of the cardholder."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAuthentication = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmAuthenticationMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardholderRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Authentication";
			definition = "Data related to the authentication of the cardholder.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Authentication.mmCardholder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderRole";
				definition = "Party entitled by a card issuer to use a card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Authentication.mmCardholder);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardholderRole.mmAuthentication);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardholderRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Authentication> getAuthentication() {
		return authentication;
	}

	public void setAuthentication(List<com.tools20022.repository.entity.Authentication> authentication) {
		this.authentication = authentication;
	}
}