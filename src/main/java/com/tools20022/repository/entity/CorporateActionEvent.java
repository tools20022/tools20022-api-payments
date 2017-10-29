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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.CorporateAction9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An event determined by a corporation's board of directors, that changes the
 * existing corporate capital structure or financial condition.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionEvent" src="doc-files/CorporateActionEvent.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionEvent#Type
 * CorporateActionEvent.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MandatoryVoluntaryEventType
 * CorporateActionEvent.MandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#UnderlyingSecurity
 * CorporateActionEvent.UnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionPrice
 * CorporateActionEvent.CorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ExchangeRate
 * CorporateActionEvent.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RegistrationDetails
 * CorporateActionEvent.RegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BasketOrIndexInformation
 * CorporateActionEvent.BasketOrIndexInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Deadline
 * CorporateActionEvent.Deadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#AdditionalBusinessProcess
 * CorporateActionEvent.AdditionalBusinessProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TradingDate
 * CorporateActionEvent.TradingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionCharge
 * CorporateActionEvent.CorporateActionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#PariPassuDate
 * CorporateActionEvent.PariPassuDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#InformationConditions
 * CorporateActionEvent.InformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#FractionalQuantity
 * CorporateActionEvent.FractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#EventProcessingType
 * CorporateActionEvent.EventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionStatus
 * CorporateActionEvent.CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#AnnouncementDate
 * CorporateActionEvent.AnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#EffectiveDate
 * CorporateActionEvent.EffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#FurtherDetailsAnnouncementDate
 * CorporateActionEvent.FurtherDetailsAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MarginFixingDate
 * CorporateActionEvent.MarginFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ResultPublicationDate
 * CorporateActionEvent.ResultPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#UnconditionalDate
 * CorporateActionEvent.UnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#WhollyUnconditionalDate
 * CorporateActionEvent.WhollyUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#LapsedDate
 * CorporateActionEvent.LapsedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BookClosurePeriod
 * CorporateActionEvent.BookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantity
 * CorporateActionEvent.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RestrictionIndicator
 * CorporateActionEvent.RestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#EventStage
 * CorporateActionEvent.EventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#DocumentationLocation
 * CorporateActionEvent.DocumentationLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantitySought
 * CorporateActionEvent.SecuritiesQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#PartialElectionIndicator
 * CorporateActionEvent.PartialElectionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionPartyRole
 * CorporateActionEvent.CorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MarketClaim
 * CorporateActionEvent.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BiddingConditions
 * CorporateActionEvent.BiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedClassAction
 * CorporateActionEvent.RelatedClassAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionEventRegistration
 * CorporateActionEvent.CorporateActionEventRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SuspensionPeriod
 * CorporateActionEvent.SuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Lottery
 * CorporateActionEvent.Lottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MarginType
 * CorporateActionEvent.MarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedMeeting
 * CorporateActionEvent.RelatedMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Services
 * CorporateActionEvent.Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Issuance
 * CorporateActionEvent.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesModification
 * CorporateActionEvent.SecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TradingPeriod
 * CorporateActionEvent.TradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TransactionTax
 * CorporateActionEvent.TransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ConsentType
 * CorporateActionEvent.ConsentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ProceedsDefinition
 * CorporateActionEvent.ProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CorporateEvent
 * Security.CorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedCorporateActionEvent
 * ContactPoint.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BookClosureCorporateAction
 * DateTimePeriod.BookClosureCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedCorporateAction
 * DateTimePeriod.RelatedCorporateAction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CorporateActionEvent
 * Tax.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedEventForFractionalQuantity
 * SecuritiesQuantity.RelatedEventForFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionEvent
 * SecuritiesQuantity.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCorporateActionEvent
 * SecuritiesQuantity.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionEvent
 * CorporateActionStatus.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedCorporateActionEvent
 * CurrencyExchange.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#CorporateActionEvent
 * CorporateActionEventRegistration.CorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#EventInformation
 * Issuance.EventInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#CorporateAction
 * ProceedsDefinition.CorporateAction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#CorporateEvent
 * ClassAction.CorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#RelatedCorporateEvent
 * SecuritiesModification.RelatedCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BiddingConditions#Event
 * BiddingConditions.Event}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionEvent
 * CorporateActionPrice.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#Event
 * CorporateActionServicing.Event}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#RelatedCorporateActionEvent
 * Deadline.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#CorporateAction
 * CorporateActionFeesAndCharges.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#RelatedCorporateEvent
 * MarketClaim.RelatedCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#CorporateActionEvent
 * SuspensionPeriod.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#RelatedCorporateEvent
 * Lottery.RelatedCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#CorporateEvent
 * Meeting.CorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#CorporateActionEvent
 * CorporateActionPartyRole.CorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction9
 * CorporateAction9}</li>
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
 * "CorporateActionEvent"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition."
 * </li>
 * </ul>
 */
public class CorporateActionEvent {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction9#EventType
	 * CorporateAction9.EventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction9.EventType);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventTypeV3Code.mmObject();
		}
	};
	/**
	 * Specifies whether the event is mandatory, mandatory with options or
	 * voluntary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode
	 * CorporateActionMandatoryVoluntaryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the event is mandatory, mandatory with options or voluntary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MandatoryVoluntaryEventType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatoryVoluntaryEventType";
			definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
		}
	};
	/**
	 * Security to which this instruction or event applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#CorporateEvent
	 * Security.CorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security to which this instruction or event applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnderlyingSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security to which this instruction or event applies.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies prices related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionEvent
	 * CorporateActionPrice.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies prices related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPrice";
			definition = "Specifies prices related to a corporate action.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate, specified by the issuer, when the paid amount is not in the same
	 * currency as the specified amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedCorporateActionEvent
	 * CurrencyExchange.RelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount.";
			minOccurs = 0;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides information required for the registration.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationDetails = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Provides additional information on the basket or index underlying a
	 * security, for example a warrant.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketOrIndexInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the basket or index underlying a security, for example a warrant."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BasketOrIndexInformation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the different deadlines related to a corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#RelatedCorporateActionEvent
	 * Deadline.RelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different deadlines related to a corporate event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Deadline = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines related to a corporate event.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of the additional business process linked to a
	 * corporate action event such as a claim compensation or tax refund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AdditionalBusinessProcess = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalBusinessProcess";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AdditionalBusinessProcessCode.mmObject();
		}
	};
	/**
	 * Date/time at which the deal (rights) was agreed.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the deal (rights) was agreed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the charges relative to a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#CorporateAction
	 * CorporateActionFeesAndCharges.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the charges relative to a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionCharge = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCharge";
			definition = "Specifies the charges relative to a corporate action event.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.CorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which security will assimilate, become fungible, or have the same
	 * rights to dividends as the parent issue.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PariPassuDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PariPassuDate";
			definition = "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Provides conditional information related to the event, eg, an offer is
	 * subject to 50% acceptance, the offeror allows the securities holder to
	 * set some conditions.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InformationConditions = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Fractional quantity resulting from an event which will be paid with cash
	 * in lieu.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedEventForFractionalQuantity
	 * SecuritiesQuantity.RelatedEventForFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fractional quantity resulting from an event which will be paid with cash in lieu. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FractionalQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionalQuantity";
			definition = "Fractional quantity resulting from an event which will be paid with cash in lieu. ";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedEventForFractionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of processing involved by a Corporate Action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode
	 * CorporateActionEventProcessingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventProcessingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of processing involved by a Corporate Action."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EventProcessingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventProcessingType";
			definition = "Type of processing involved by a Corporate Action.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
		}
	};
	/**
	 * Status of the corporate action process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionEvent
	 * CorporateActionStatus.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the corporate action process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Status of the corporate action process.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time at which the issuer announced that a corporate action event
	 * will occur such as the issue of securities or an official meeting.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AnnouncementDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which an event is officially effective from the issuer's
	 * perspective.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event is officially effective from the issuer's perspective."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which additional information on the event will be announced,
	 * for instance exchange ratio announcement date.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherDetailsAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FurtherDetailsAnnouncementDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FurtherDetailsAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the margin rate will be determined .
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the margin rate will be determined ."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginFixingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined .";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which results are published, eg, results of an offer, of a
	 * meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which results are published, eg, results of an offer, of a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResultPublicationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which results are published, eg, results of an offer, of a meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date upon which the terms of the take-over become unconditional as to
	 * acceptances.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which the terms of the take-over become unconditional as to acceptances."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnconditionalDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnconditionalDate";
			definition = "Date upon which the terms of the take-over become unconditional as to acceptances.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which all conditions, including regulatory, legal etc. pertaining
	 * to the take-over, have been met.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WhollyUnconditionalDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which an event/offer is terminated or lapsed.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LapsedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event/offer is terminated or lapsed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LapsedDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period defining the last date on which shareholder registration will be
	 * accepted by the issuer and the date on which shareholder registration
	 * will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BookClosureCorporateAction
	 * DateTimePeriod.BookClosureCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookClosurePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BookClosurePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BookClosureCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides information about securities quantity linked to a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionEvent
	 * SecuritiesQuantity.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether there are legal or other restrictions associated with a
	 * rights offer or other corporate event, for example, domicile,
	 * citizenship, residency, type of investor.<br>
	 * Yes = There are restrictions.<br>
	 * No = There are no restrictions.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RestrictionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Stage in the corporate action event life cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EventStage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStageCode.mmObject();
		}
	};
	/**
	 * Information on where additional information published for the event, can
	 * be received. for instance the address for the Universal Resource Locator
	 * (URL), eg, used over the www (HTTP) service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedCorporateActionEvent
	 * ContactPoint.RelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DocumentationLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentationLocation";
			definition = "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of securities the offeror/issuer will purchase or redeem under
	 * the terms of the event. This can be a number or the term "any and all".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCorporateActionEvent
	 * SecuritiesQuantity.RelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantitySought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantitySought = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantitySought";
			definition = "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies if the issuer will allow the agent to accept partial elections.
	 * It is to allow split voting over options. It allows the client to elect
	 * more than one option to be selected per designated holding.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialElectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialElectionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialElectionIndicator";
			definition = "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the role played by a party in the context of a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#CorporateActionEvent
	 * CorporateActionPartyRole.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
	 * CorporateActionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role played by a party in the context of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPartyRole";
			definition = "Specifies the role played by a party in the context of a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market claim information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#RelatedCorporateEvent
	 * MarketClaim.RelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarketClaim
	 * MarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market claim information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarketClaim = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Market claim information.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarketClaim.RelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the conditions under which securities can be acquired as part
	 * of a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#Event
	 * BiddingConditions.Event}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions under which securities can be acquired as part of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.Event;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the underlying class action related to the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#CorporateEvent
	 * ClassAction.CorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClassAction
	 * ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClassAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying class action related to the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedClassAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClassAction";
			definition = "Specifies the underlying class action related to the event.";
			minOccurs = 0;
			type_lazy = () -> ClassAction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClassAction.CorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Official registration of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#CorporateActionEvent
	 * CorporateActionEventRegistration.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official registration of the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEventRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventRegistration";
			definition = "Official registration of the event.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date for which an action will be accepted and
	 * the date on which the suspension will be released and normal processing
	 * will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#CorporateActionEvent
	 * SuspensionPeriod.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspensionPeriod";
			definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Organisation of draws for cash prizes on bonds (instead of coupon
	 * payments). Every issued bond (similar to a lottery ticket) has an equal
	 * opportunity at winning payments in the draws.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#RelatedCorporateEvent
	 * Lottery.RelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Lottery Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lottery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Lottery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.RelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the margin type for a remarketing procedure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginTypeCode
	 * RemarketingMarginTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the margin type for a remarketing procedure."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginType";
			definition = "Specifies the margin type for a remarketing procedure.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RemarketingMarginTypeCode.mmObject();
		}
	};
	/**
	 * Provides information on the meeting related to the corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#CorporateEvent
	 * Meeting.CorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the meeting  related to the corporate event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Provides information on the meeting  related to the corporate event.";
			minOccurs = 0;
			type_lazy = () -> Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.CorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the different services linked to a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#Event
	 * CorporateActionServicing.Event}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different services linked to a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Specifies the different services linked to a corporate action event.";
			minOccurs = 0;
			type_lazy = () -> CorporateActionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.Event;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information specified when the corporate event relates to the issuance of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#EventInformation
	 * Issuance.EventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information specified when the corporate event relates to the issuance of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Information specified when the corporate event relates to the issuance of securities.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.EventInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Modification of the reference data of a security or of the organisation
	 * that issued it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#RelatedCorporateEvent
	 * SecuritiesModification.RelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of the reference data of a security or of the organisation that issued it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesModification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Modification of the reference data of a security or of the organisation that issued it.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.RelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which a financial instrument is available for trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedCorporateAction
	 * DateTimePeriod.RelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a financial instrument is available for trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradingPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax rate of financial transactions related to an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#CorporateActionEvent
	 * Tax.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax rate of financial transactions related to an event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax rate of financial transactions related to an event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate actions may be approved by shareholders without a meeting or a
	 * vote by means of execution of a consent by a majority of shareholders
	 * entitled to vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConsentTypeCode
	 * ConsentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConsentType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentType";
			definition = "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ConsentTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the proceeds of a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#CorporateAction
	 * ProceedsDefinition.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the proceeds of a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Specifies the proceeds of a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.CorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEvent";
				definition = "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CorporateEvent, com.tools20022.repository.entity.ContactPoint.RelatedCorporateActionEvent,
						com.tools20022.repository.entity.DateTimePeriod.BookClosureCorporateAction, com.tools20022.repository.entity.DateTimePeriod.RelatedCorporateAction, com.tools20022.repository.entity.Tax.CorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedEventForFractionalQuantity, com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionStatus.CorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.RelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionEventRegistration.CorporateActionEvent,
						com.tools20022.repository.entity.Issuance.EventInformation, com.tools20022.repository.entity.ProceedsDefinition.CorporateAction, com.tools20022.repository.entity.ClassAction.CorporateEvent,
						com.tools20022.repository.entity.SecuritiesModification.RelatedCorporateEvent, com.tools20022.repository.entity.BiddingConditions.Event, com.tools20022.repository.entity.CorporateActionPrice.CorporateActionEvent,
						com.tools20022.repository.entity.CorporateActionServicing.Event, com.tools20022.repository.entity.Deadline.RelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionFeesAndCharges.CorporateAction,
						com.tools20022.repository.entity.MarketClaim.RelatedCorporateEvent, com.tools20022.repository.entity.SuspensionPeriod.CorporateActionEvent, com.tools20022.repository.entity.Lottery.RelatedCorporateEvent,
						com.tools20022.repository.entity.Meeting.CorporateEvent, com.tools20022.repository.entity.CorporateActionPartyRole.CorporateActionEvent);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.Type, com.tools20022.repository.entity.CorporateActionEvent.MandatoryVoluntaryEventType,
						com.tools20022.repository.entity.CorporateActionEvent.UnderlyingSecurity, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice,
						com.tools20022.repository.entity.CorporateActionEvent.ExchangeRate, com.tools20022.repository.entity.CorporateActionEvent.RegistrationDetails,
						com.tools20022.repository.entity.CorporateActionEvent.BasketOrIndexInformation, com.tools20022.repository.entity.CorporateActionEvent.Deadline,
						com.tools20022.repository.entity.CorporateActionEvent.AdditionalBusinessProcess, com.tools20022.repository.entity.CorporateActionEvent.TradingDate,
						com.tools20022.repository.entity.CorporateActionEvent.CorporateActionCharge, com.tools20022.repository.entity.CorporateActionEvent.PariPassuDate,
						com.tools20022.repository.entity.CorporateActionEvent.InformationConditions, com.tools20022.repository.entity.CorporateActionEvent.FractionalQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.EventProcessingType, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionEvent.AnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.EffectiveDate,
						com.tools20022.repository.entity.CorporateActionEvent.FurtherDetailsAnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.MarginFixingDate,
						com.tools20022.repository.entity.CorporateActionEvent.ResultPublicationDate, com.tools20022.repository.entity.CorporateActionEvent.UnconditionalDate,
						com.tools20022.repository.entity.CorporateActionEvent.WhollyUnconditionalDate, com.tools20022.repository.entity.CorporateActionEvent.LapsedDate,
						com.tools20022.repository.entity.CorporateActionEvent.BookClosurePeriod, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.RestrictionIndicator, com.tools20022.repository.entity.CorporateActionEvent.EventStage,
						com.tools20022.repository.entity.CorporateActionEvent.DocumentationLocation, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantitySought,
						com.tools20022.repository.entity.CorporateActionEvent.PartialElectionIndicator, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPartyRole,
						com.tools20022.repository.entity.CorporateActionEvent.MarketClaim, com.tools20022.repository.entity.CorporateActionEvent.BiddingConditions, com.tools20022.repository.entity.CorporateActionEvent.RelatedClassAction,
						com.tools20022.repository.entity.CorporateActionEvent.CorporateActionEventRegistration, com.tools20022.repository.entity.CorporateActionEvent.SuspensionPeriod,
						com.tools20022.repository.entity.CorporateActionEvent.Lottery, com.tools20022.repository.entity.CorporateActionEvent.MarginType, com.tools20022.repository.entity.CorporateActionEvent.RelatedMeeting,
						com.tools20022.repository.entity.CorporateActionEvent.Services, com.tools20022.repository.entity.CorporateActionEvent.Issuance, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesModification,
						com.tools20022.repository.entity.CorporateActionEvent.TradingPeriod, com.tools20022.repository.entity.CorporateActionEvent.TransactionTax, com.tools20022.repository.entity.CorporateActionEvent.ConsentType,
						com.tools20022.repository.entity.CorporateActionEvent.ProceedsDefinition);
				derivationComponent_lazy = () -> Arrays.asList(CorporateAction9.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}