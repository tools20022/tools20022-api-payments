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
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OperationMandate2;
import com.tools20022.repository.msg.OperationMandate3;
import com.tools20022.repository.msg.PartyAndAuthorisation1;
import com.tools20022.repository.msg.PartyAndAuthorisation3;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the signature requirements for managing an account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SignatureCondition" src="doc-files/SignatureCondition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmRequiredSignatureNumber
 * SignatureCondition.mmRequiredSignatureNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatoryRightIndicator
 * SignatureCondition.mmSignatoryRightIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmMandate
 * SignatureCondition.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatureOrderIndicator
 * SignatureCondition.mmSignatureOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatureOrder
 * SignatureCondition.mmSignatureOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignature
 * SignatureCondition.mmSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Signature#mmConditions
 * Signature.mmConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Mandate#mmSignatureConditions
 * Mandate.mmSignatureConditions}</li>
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
 * "SignatureCondition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the signature requirements for managing an account."
 * </li>
 * </ul>
 */
public class SignatureCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Number requiredSignatureNumber;
	/**
	 * Number of account owners or related parties required to authorise
	 * transactions on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredSignatureNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of account owners or related parties required to authorise transactions on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequiredSignatureNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequiredSignatureNumber";
			definition = "Number of account owners or related parties required to authorise transactions on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SignatureCondition.class.getMethod("getRequiredSignatureNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator signatoryRightIndicator;
	/**
	 * Indicates whether the signature of the account owner is required to
	 * authorise transactions on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatoryRightIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the signature of the account owner is required to authorise transactions on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSignatoryRightIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the signature of the account owner is required to authorise transactions on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SignatureCondition.class.getMethod("getSignatoryRightIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Mandate mandate;
	/**
	 * Mandate for which signature conditions are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmSignatureConditions
	 * Mandate.mmSignatureConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate for which signature conditions are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMandate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Mandate for which signature conditions are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.mmSignatureConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	protected TrueFalseIndicator signatureOrderIndicator;
	/**
	 * Indicator whether a certain order of signatures has to be respected or
	 * not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmSignatureOrderIndicator
	 * OperationMandate2.mmSignatureOrderIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3#mmSignatureOrderIndicator
	 * OperationMandate3.mmSignatureOrderIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator whether a certain order of signatures has to be respected or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSignatureOrderIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OperationMandate2.mmSignatureOrderIndicator, OperationMandate3.mmSignatureOrderIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureOrderIndicator";
			definition = "Indicator whether a certain order of signatures has to be respected or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SignatureCondition.class.getMethod("getSignatureOrderIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max15PlusSignedNumericText signatureOrder;
	/**
	 * Indicates the order in which the mandate holders are allowed to sign.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#mmSignatureOrder
	 * PartyAndAuthorisation1.mmSignatureOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#mmSignatureOrder
	 * PartyAndAuthorisation3.mmSignatureOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the order in which the mandate holders are allowed to sign."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSignatureOrder = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PartyAndAuthorisation1.mmSignatureOrder, PartyAndAuthorisation3.mmSignatureOrder);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureOrder";
			definition = "Indicates the order in which the mandate holders are allowed to sign.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15PlusSignedNumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SignatureCondition.class.getMethod("getSignatureOrder", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Signature> signature;
	/**
	 * Manual or digital signature added as security provision by each party
	 * involved in the business covered by the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Signature#mmConditions
	 * Signature.mmConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Signature Signature}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manual or digital signature added as security provision by each party involved in the business covered by the document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSignature = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Signature";
			definition = "Manual or digital signature added as security provision by each party involved in the business covered by the document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Signature.mmConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SignatureCondition";
				definition = "Specifies the signature requirements for managing an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Signature.mmConditions, com.tools20022.repository.entity.Mandate.mmSignatureConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SignatureCondition.mmRequiredSignatureNumber, com.tools20022.repository.entity.SignatureCondition.mmSignatoryRightIndicator,
						com.tools20022.repository.entity.SignatureCondition.mmMandate, com.tools20022.repository.entity.SignatureCondition.mmSignatureOrderIndicator, com.tools20022.repository.entity.SignatureCondition.mmSignatureOrder,
						com.tools20022.repository.entity.SignatureCondition.mmSignature);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SignatureCondition.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Number getRequiredSignatureNumber() {
		return requiredSignatureNumber;
	}

	public void setRequiredSignatureNumber(Number requiredSignatureNumber) {
		this.requiredSignatureNumber = requiredSignatureNumber;
	}

	public YesNoIndicator getSignatoryRightIndicator() {
		return signatoryRightIndicator;
	}

	public void setSignatoryRightIndicator(YesNoIndicator signatoryRightIndicator) {
		this.signatoryRightIndicator = signatoryRightIndicator;
	}

	public Mandate getMandate() {
		return mandate;
	}

	public void setMandate(com.tools20022.repository.entity.Mandate mandate) {
		this.mandate = mandate;
	}

	public TrueFalseIndicator getSignatureOrderIndicator() {
		return signatureOrderIndicator;
	}

	public void setSignatureOrderIndicator(TrueFalseIndicator signatureOrderIndicator) {
		this.signatureOrderIndicator = signatureOrderIndicator;
	}

	public Max15PlusSignedNumericText getSignatureOrder() {
		return signatureOrder;
	}

	public void setSignatureOrder(Max15PlusSignedNumericText signatureOrder) {
		this.signatureOrder = signatureOrder;
	}

	public List<Signature> getSignature() {
		return signature;
	}

	public void setSignature(List<com.tools20022.repository.entity.Signature> signature) {
		this.signature = signature;
	}
}