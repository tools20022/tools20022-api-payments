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
import com.tools20022.repository.codeset.PartyTypeCode;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Role played by a party in the context of a payment by card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentPartyRole" src="doc-files/CardPaymentPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#mmCardPayment
 * CardPaymentPartyRole.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#mmPartyType
 * CardPaymentPartyRole.mmPartyType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCardPartyRole
 * CardPayment.mmPaymentCardPartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CardholderRole
 * CardholderRole}</li>
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
 * "CardPaymentPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party in the context of a payment by card."</li>
 * </ul>
 */
public class CardPaymentPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CardPayment> cardPayment;
	/**
	 * Identifies the payment by card for which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCardPartyRole
	 * CardPayment.mmPaymentCardPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
	 * CardPaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the payment by card for which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCardPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Identifies the payment by card for which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmPaymentCardPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};
	protected PartyTypeCode partyType;
	/**
	 * Specifies the type of party which plays a role in the context od a card
	 * payment process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
	 * CardPaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of party which plays a role in the context od a card payment process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of party which plays a role in the context od a card payment process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentPartyRole.class.getMethod("getPartyType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentPartyRole";
				definition = "Role played by a party in the context of a payment by card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmPaymentCardPartyRole);
				subType_lazy = () -> Arrays.asList(CardholderRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentPartyRole.mmCardPayment, com.tools20022.repository.entity.CardPaymentPartyRole.mmPartyType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardPaymentPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CardPayment> getCardPayment() {
		return cardPayment;
	}

	public void setCardPayment(List<com.tools20022.repository.entity.CardPayment> cardPayment) {
		this.cardPayment = cardPayment;
	}

	public PartyTypeCode getPartyType() {
		return partyType;
	}

	public void setPartyType(PartyTypeCode partyType) {
		this.partyType = partyType;
	}
}