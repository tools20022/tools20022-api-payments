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
import com.tools20022.repository.codeset.ResponseCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Response of a requested service.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Response" src="doc-files/Response.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Response#mmResponseReason
 * Response.mmResponseReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#mmRelatedCardPaymentValidation
 * Response.mmRelatedCardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#mmResponseToAuthorisation
 * Response.mmResponseToAuthorisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
 * CardPaymentValidation.mmResponse}</li>
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
 * "Response"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response of a requested service."</li>
 * </ul>
 */
public class Response {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text responseReason;
	/**
	 * Detailed result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Response
	 * Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed result of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResponseReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Response.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResponseReason";
			definition = "Detailed result of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Response.class.getMethod("getResponseReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CardPaymentValidation relatedCardPaymentValidation;
	/**
	 * Validation process to which a response is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Response
	 * Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPaymentValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation process to which a response is given."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCardPaymentValidation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Response.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidation";
			definition = "Validation process to which a response is given.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmResponse;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
		}
	};
	protected ResponseCode responseToAuthorisation;
	/**
	 * Response from the issuer to the authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ResponseCode
	 * ResponseCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Response
	 * Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseToAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response from the issuer to the authorisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResponseToAuthorisation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Response.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResponseToAuthorisation";
			definition = "Response from the issuer to the authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResponseCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Response.class.getMethod("getResponseToAuthorisation", new Class[]{});
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
				name = "Response";
				definition = "Response of a requested service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentValidation.mmResponse);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Response.mmResponseReason, com.tools20022.repository.entity.Response.mmRelatedCardPaymentValidation,
						com.tools20022.repository.entity.Response.mmResponseToAuthorisation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Response.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getResponseReason() {
		return responseReason;
	}

	public void setResponseReason(Max35Text responseReason) {
		this.responseReason = responseReason;
	}

	public CardPaymentValidation getRelatedCardPaymentValidation() {
		return relatedCardPaymentValidation;
	}

	public void setRelatedCardPaymentValidation(com.tools20022.repository.entity.CardPaymentValidation relatedCardPaymentValidation) {
		this.relatedCardPaymentValidation = relatedCardPaymentValidation;
	}

	public ResponseCode getResponseToAuthorisation() {
		return responseToAuthorisation;
	}

	public void setResponseToAuthorisation(ResponseCode responseToAuthorisation) {
		this.responseToAuthorisation = responseToAuthorisation;
	}
}