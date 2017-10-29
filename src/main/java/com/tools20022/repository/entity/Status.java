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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The status of an instruction, advice or request.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Status" src="doc-files/Status.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Status#StatusReason
 * Status.StatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#StatusDateTime
 * Status.StatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#ValidityTime
 * Status.ValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#StatusDescription
 * Status.StatusDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#InstructionProcessingStatus
 * Status.InstructionProcessingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#PartyRole
 * Status.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#SettlementStatus
 * Status.SettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#CancellationProcessingStatus
 * Status.CancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
 * Status.TransactionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#ModificationProcessingStatus
 * Status.ModificationProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Status
 * DateTimePeriod.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#Status
 * StatusReason.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#Status
 * InvestigationPartyRole.Status}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#Identification
 * GenericValidationRuleIdentification1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#RecordStatus
 * CurrencyControlPackageStatus1.RecordStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LimitStatus LimitStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus
 * SecuritiesStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatus
 * UndertakingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus MandateStatus}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
 * TreasuryTradeSettlementStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPaymentStatus
 * CardPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
 * InvestigationCaseStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
 * InvoiceFinancingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BaselineStatus
 * BaselineStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuoteStatus QuoteStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceStatus InvoiceStatus}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1
 * GenericValidationRuleIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
 * CurrencyControlGroupStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1
 * CurrencyControlPackageStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ValidationStatusReason1
 * ValidationStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1
 * CurrencyControlRecordStatus1}</li>
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
 * "Status"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The status of an instruction, advice or request."</li>
 * </ul>
 */
public class Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reasons for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#Status
	 * StatusReason.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#Reason
	 * StatusReasonInformation9.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#ReturnReasonInformation
	 * OriginalGroupHeader2.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#StatusReason
	 * CurrencyControlPackageStatus1.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#Reason
	 * ValidationStatusReason1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#StatusReason
	 * CurrencyControlRecordStatus1.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#StatusReasonInformation
	 * PaymentTransaction80.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#StatusReasonInformation
	 * OriginalGroupHeader7.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ReversalReasonInformation
	 * PaymentTransaction81.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#StatusReasonInformation
	 * OriginalPaymentInstruction23.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#ReversalReasonInformation
	 * OriginalPaymentInstruction21.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#AmendmentReason
	 * MandateAmendment5.AmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#StatusReasonInformation
	 * OriginalPaymentInstruction24.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#StatusReasonInformation
	 * OriginalGroupInformation28.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ReturnReasonInformation
	 * PaymentTransaction76.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#CancellationReasonInformation
	 * OriginalPaymentInstruction20.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#StatusReasonInformation
	 * PaymentTransaction83.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#ReversalReasonInformation
	 * PaymentTransaction77.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#StatusReasonInformation
	 * PaymentTransaction82.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateSuspensionReason1#Reason
	 * MandateSuspensionReason1.Reason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reasons for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StatusReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReasonInformation9.Reason, com.tools20022.repository.msg.OriginalGroupHeader2.ReturnReasonInformation,
					com.tools20022.repository.msg.CurrencyControlPackageStatus1.StatusReason, com.tools20022.repository.msg.ValidationStatusReason1.Reason, com.tools20022.repository.msg.CurrencyControlRecordStatus1.StatusReason,
					com.tools20022.repository.msg.PaymentTransaction80.StatusReasonInformation, com.tools20022.repository.msg.OriginalGroupHeader7.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction81.ReversalReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction23.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction21.ReversalReasonInformation, com.tools20022.repository.msg.MandateAmendment5.AmendmentReason,
					com.tools20022.repository.msg.OriginalPaymentInstruction24.StatusReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation28.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction76.ReturnReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction20.CancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction83.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction77.ReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction82.StatusReasonInformation, com.tools20022.repository.msg.MandateSuspensionReason1.Reason);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusReason";
			definition = "Specifies the reasons for the status.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time at which the status was assigned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus2#DateTime
	 * CaseStatus2.DateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#StatusDateTime
	 * CurrencyControlGroupStatus1.StatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#StatusDateTime
	 * CurrencyControlPackageStatus1.StatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractJournal1#ClosureDate
	 * RegisteredContractJournal1.ClosureDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#StatusDateTime
	 * CurrencyControlRecordStatus1.StatusDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StatusDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.CaseStatus2.DateTime, com.tools20022.repository.msg.CurrencyControlGroupStatus1.StatusDateTime, com.tools20022.repository.msg.CurrencyControlPackageStatus1.StatusDateTime,
							com.tools20022.repository.msg.RegisteredContractJournal1.ClosureDate, com.tools20022.repository.msg.CurrencyControlRecordStatus1.StatusDateTime);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusDateTime";
			definition = "Date and time at which the status was assigned.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period of time during which the status is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#Status
	 * DateTimePeriod.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time during which the status is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityTime = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityTime";
			definition = "Period of time during which the status is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the state or the condition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#AdditionalInformation
	 * StatusReasonInformation9.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#Description
	 * GenericValidationRuleIdentification1.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#Status
	 * CurrencyControlGroupStatus1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#ValidationRule
	 * ValidationStatusReason1.ValidationRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#AdditionalInformation
	 * ValidationStatusReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#Status
	 * CurrencyControlRecordStatus1.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state or the condition."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StatusDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReasonInformation9.AdditionalInformation, com.tools20022.repository.msg.GenericValidationRuleIdentification1.Description,
					com.tools20022.repository.msg.CurrencyControlGroupStatus1.Status, com.tools20022.repository.msg.ValidationStatusReason1.ValidationRule, com.tools20022.repository.msg.ValidationStatusReason1.AdditionalInformation,
					com.tools20022.repository.msg.CurrencyControlRecordStatus1.Status);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusDescription";
			definition = "Specifies the state or the condition.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Status of the processing of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.StatusCode
	 * StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#Status
	 * CurrencyControlPackageStatus1.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the processing of an instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyControlPackageStatus1.Status);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Status of the processing of an instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StatusCode.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of assigning a status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#Status
	 * InvestigationPartyRole.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole
	 * InvestigationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of assigning a status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of assigning a status.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestigationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementStatus";
			definition = "Status of settlement of a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the status of a cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a cancellation request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationProcessingStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Specifies the status of a cancellation request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Status of processing of a transaction at account servicer level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of processing of a transaction at account servicer level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionProcessingStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionProcessingStatus";
			definition = "Status of processing of a transaction at account servicer level.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstructionProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Provides the status of a modification request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of a modification request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ModificationProcessingStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides the status of a modification request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ModificationProcessingStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Status";
				definition = "The status of an instruction, advice or request.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.Status, com.tools20022.repository.entity.StatusReason.Status, com.tools20022.repository.entity.InvestigationPartyRole.Status);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericValidationRuleIdentification1.Identification, com.tools20022.repository.msg.CurrencyControlPackageStatus1.RecordStatus);
				subType_lazy = () -> Arrays.asList(AccountStatus.mmObject(), PaymentStatus.mmObject(), SystemStatus.mmObject(), LimitStatus.mmObject(), SecuritiesTradeStatus.mmObject(), CorporateActionStatus.mmObject(),
						SecuritiesStatus.mmObject(), UndertakingStatus.mmObject(), MandateStatus.mmObject(), TreasuryTradeSettlementStatus.mmObject(), CardPaymentStatus.mmObject(), SecuritiesOrderStatus.mmObject(),
						InvestigationCaseStatus.mmObject(), MeetingStatus.mmObject(), CollateralStatus.mmObject(), InvoiceFinancingStatus.mmObject(), BaselineStatus.mmObject(), QuoteStatus.mmObject(), InvoiceStatus.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Status.StatusReason, com.tools20022.repository.entity.Status.StatusDateTime, com.tools20022.repository.entity.Status.ValidityTime,
						com.tools20022.repository.entity.Status.StatusDescription, com.tools20022.repository.entity.Status.InstructionProcessingStatus, com.tools20022.repository.entity.Status.PartyRole,
						com.tools20022.repository.entity.Status.SettlementStatus, com.tools20022.repository.entity.Status.CancellationProcessingStatus, com.tools20022.repository.entity.Status.TransactionProcessingStatus,
						com.tools20022.repository.entity.Status.ModificationProcessingStatus);
				derivationComponent_lazy = () -> Arrays.asList(GenericValidationRuleIdentification1.mmObject(), CurrencyControlGroupStatus1.mmObject(), CurrencyControlPackageStatus1.mmObject(), ValidationStatusReason1.mmObject(),
						CurrencyControlRecordStatus1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}