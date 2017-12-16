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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Processes that reallocate corporate action proceeds to the entitled party and
 * that compensate financial penalties or indirect costs due to late delivery or
 * payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MarketClaim" src="doc-files/MarketClaim.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimAmount
 * MarketClaim.mmMarketClaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimTrackingEndDate
 * MarketClaim.mmMarketClaimTrackingEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmRelatedCorporateEvent
 * MarketClaim.mmRelatedCorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarketClaim
 * CorporateActionEvent.mmMarketClaim}</li>
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
 * "MarketClaim"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processes that reallocate corporate action proceeds to the entitled party and that compensate financial penalties or indirect costs due to late delivery or payment."
 * </li>
 * </ul>
 */
public class MarketClaim {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount marketClaimAmount;
	/**
	 * Amount of money resulting from a market claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim MarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money resulting from a market claim."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketClaimAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaimAmount";
			definition = "Amount of money resulting from a market claim.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarketClaim.class.getMethod("getMarketClaimAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime marketClaimTrackingEndDate;
	/**
	 * Date by which the depository stops monitoring activities of the event,
	 * for instance, accounting and tracking activities for due bills end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim MarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimTrackingEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketClaimTrackingEndDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaimTrackingEndDate";
			definition = "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarketClaim.class.getMethod("getMarketClaimTrackingEndDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEvent relatedCorporateEvent;
	/**
	 * Corporate event for which market claim information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarketClaim
	 * CorporateActionEvent.mmMarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim MarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which market claim information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which market claim information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmMarketClaim;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketClaim";
				definition = "Processes that reallocate corporate action proceeds to the entitled party and that compensate financial penalties or indirect costs due to late delivery or payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmMarketClaim);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarketClaim.mmMarketClaimAmount, com.tools20022.repository.entity.MarketClaim.mmMarketClaimTrackingEndDate,
						com.tools20022.repository.entity.MarketClaim.mmRelatedCorporateEvent);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarketClaim.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getMarketClaimAmount() {
		return marketClaimAmount;
	}

	public void setMarketClaimAmount(CurrencyAndAmount marketClaimAmount) {
		this.marketClaimAmount = marketClaimAmount;
	}

	public ISODateTime getMarketClaimTrackingEndDate() {
		return marketClaimTrackingEndDate;
	}

	public void setMarketClaimTrackingEndDate(ISODateTime marketClaimTrackingEndDate) {
		this.marketClaimTrackingEndDate = marketClaimTrackingEndDate;
	}

	public CorporateActionEvent getRelatedCorporateEvent() {
		return relatedCorporateEvent;
	}

	public void setRelatedCorporateEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateEvent) {
		this.relatedCorporateEvent = relatedCorporateEvent;
	}
}