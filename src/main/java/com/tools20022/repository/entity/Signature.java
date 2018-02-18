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
import com.tools20022.repository.entity.Evidence;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Cheque7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Additional security provision attached to a contract. A (numeric) signature
 * can be used as evidence of origin and integrity, i.e., authenticity of the
 * signed data. A judge can accept this evidence as proof.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Signature" src="doc-files/Signature.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Evidence Evidence}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Signature#mmConditions
 * Signature.mmConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Signature#mmCardPaymentValidation
 * Signature.mmCardPaymentValidation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignature
 * SignatureCondition.mmSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmSignature
 * CardPaymentValidation.mmSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmSignature
 * Cheque7.mmSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ElectronicSignature
 * ElectronicSignature}</li>
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
 * "Signature"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional security provision attached to a contract. A (numeric) signature can be used as evidence of origin and integrity, i.e., authenticity of the signed data. A judge can accept this evidence as proof."
 * </li>
 * </ul>
 */
public class Signature extends Evidence {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SignatureCondition conditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignature
	 * SignatureCondition.mmSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Signature
	 * Signature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters related to the signature provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Conditions";
			definition = "Parameters related to the signature provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmSignature;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
		}
	};
	protected CardPaymentValidation cardPaymentValidation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmSignature
	 * CardPaymentValidation.mmSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Signature
	 * Signature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation of a payment by card for which a signeture is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCardPaymentValidation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentValidation";
			definition = "Validation of a payment by card for which a signeture is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmSignature;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Signature";
				definition = "Additional security provision attached to a contract. A (numeric) signature can be used as evidence of origin and integrity, i.e., authenticity of the signed data. A judge can accept this evidence as proof.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SignatureCondition.mmSignature, com.tools20022.repository.entity.CardPaymentValidation.mmSignature);
				derivationElement_lazy = () -> Arrays.asList(Cheque7.mmSignature);
				subType_lazy = () -> Arrays.asList(ElectronicSignature.mmObject());
				superType_lazy = () -> Evidence.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Signature.mmConditions, com.tools20022.repository.entity.Signature.mmCardPaymentValidation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Signature.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SignatureCondition> getConditions() {
		return conditions == null ? Optional.empty() : Optional.of(conditions);
	}

	public Signature setConditions(com.tools20022.repository.entity.SignatureCondition conditions) {
		this.conditions = conditions;
		return this;
	}

	public CardPaymentValidation getCardPaymentValidation() {
		return cardPaymentValidation;
	}

	public Signature setCardPaymentValidation(com.tools20022.repository.entity.CardPaymentValidation cardPaymentValidation) {
		this.cardPaymentValidation = Objects.requireNonNull(cardPaymentValidation);
		return this;
	}
}