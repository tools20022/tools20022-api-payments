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
import com.tools20022.repository.codeset.QuoteStatusCode;
import com.tools20022.repository.codeset.RejectionReasonV2Code;
import com.tools20022.repository.entity.Quote;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Status of a quote and if required, the rejection reason.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="QuoteStatus" src="doc-files/QuoteStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.QuoteStatus#mmStatus
 * QuoteStatus.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuoteStatus#mmRejectionReason
 * QuoteStatus.mmRejectionReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuoteStatus#mmRelatedQuote
 * QuoteStatus.mmRelatedQuote}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmStatus
 * Quote.mmStatus}</li>
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
 * "QuoteStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a quote and if required, the rejection reason."</li>
 * </ul>
 */
public class QuoteStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected QuoteStatusCode status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuoteStatus QuoteStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the status of a quote acknowledgement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<QuoteStatus, QuoteStatusCode> mmStatus = new MMBusinessAttribute<QuoteStatus, QuoteStatusCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuoteStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Identifies the status of a quote acknowledgement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QuoteStatusCode.mmObject();
		}

		@Override
		public QuoteStatusCode getValue(QuoteStatus obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(QuoteStatus obj, QuoteStatusCode value) {
			obj.setStatus(value);
		}
	};
	protected RejectionReasonV2Code rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
	 * RejectionReasonV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuoteStatus QuoteStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the quote is rejected."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<QuoteStatus, RejectionReasonV2Code> mmRejectionReason = new MMBusinessAttribute<QuoteStatus, RejectionReasonV2Code>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuoteStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Reason why the quote is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonV2Code.mmObject();
		}

		@Override
		public RejectionReasonV2Code getValue(QuoteStatus obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(QuoteStatus obj, RejectionReasonV2Code value) {
			obj.setRejectionReason(value);
		}
	};
	protected Quote relatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#mmStatus
	 * Quote.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuoteStatus QuoteStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote for wich the status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<QuoteStatus, Quote> mmRelatedQuote = new MMBusinessAssociationEnd<QuoteStatus, Quote>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuoteStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote for wich the status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Quote.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Quote getValue(QuoteStatus obj) {
			return obj.getRelatedQuote();
		}

		@Override
		public void setValue(QuoteStatus obj, Quote value) {
			obj.setRelatedQuote(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteStatus";
				definition = "Status of a quote and if required, the rejection reason.";
				associationDomain_lazy = () -> Arrays.asList(Quote.mmStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.QuoteStatus.mmStatus, com.tools20022.repository.entity.QuoteStatus.mmRejectionReason, com.tools20022.repository.entity.QuoteStatus.mmRelatedQuote);
			}

			@Override
			public Class<?> getInstanceClass() {
				return QuoteStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public QuoteStatusCode getStatus() {
		return status;
	}

	public QuoteStatus setStatus(QuoteStatusCode status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public RejectionReasonV2Code getRejectionReason() {
		return rejectionReason;
	}

	public QuoteStatus setRejectionReason(RejectionReasonV2Code rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public Quote getRelatedQuote() {
		return relatedQuote;
	}

	public QuoteStatus setRelatedQuote(Quote relatedQuote) {
		this.relatedQuote = Objects.requireNonNull(relatedQuote);
		return this;
	}
}