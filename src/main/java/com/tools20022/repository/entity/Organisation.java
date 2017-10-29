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
import com.tools20022.repository.codeset.LegalStructureCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organised structure that is set up for a particular purpose. For example, a
 * business, government body, department, charity, or financial institution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Organisation" src="doc-files/Organisation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Purpose
 * Organisation.Purpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#RegistrationDate
 * Organisation.RegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
 * Organisation.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#ParentOrganisation
 * Organisation.ParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Branch
 * Organisation.Branch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#SecuritiesModification
 * Organisation.SecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#PlaceOfOperation
 * Organisation.PlaceOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#PlaceOfRegistration
 * Organisation.PlaceOfRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Description
 * Organisation.Description}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#LegalStructure
 * Organisation.LegalStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Sector
 * Organisation.Sector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#RelatedIndicationOfInterest
 * Organisation.RelatedIndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Strategy
 * Organisation.Strategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationHierarchy
 * Organisation.OrganisationHierarchy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#RepresentativeOfficer
 * Organisation.RepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#EstablishmentDate
 * Organisation.EstablishmentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#ParentOrganisation
 * Organisation.ParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Branch
 * Organisation.Branch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#Organisation
 * OrganisationIdentification.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#OperatingOrganisation
 * Location.OperatingOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#RegisteredOrganisation
 * Location.RegisteredOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewOrganisationInformation
 * SecuritiesModification.NewOrganisationInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#Organisation
 * Sector.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#Organisation
 * RepresentativeOfficer.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#Organisations
 * BuyOrSellIndicationOfInterest.Organisations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#Organisation
 * OrganisationStrategy.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#Organisation
 * OrganisationHierarchy.Organisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty2#LegalOrganisation
 * TradeParty2.LegalOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#DebtorAgent
 * OriginalItemReference4.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#IntermediaryAgent
 * OriginalItemReference4.IntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#DebtorAgent
 * OriginalPaymentInformation7.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#CreditorAgent
 * OriginalPaymentInformation7.CreditorAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialInstitution
 * FinancialInstitution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
 * BranchAndFinancialInstitutionIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12 Organisation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation14 Organisation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationModification1
 * OrganisationModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation2
 * LegalOrganisation2}</li>
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
 * "Organisation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution."
 * </li>
 * </ul>
 */
public class Organisation extends Party {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Purpose of the organisation, eg, charity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the organisation, eg, charity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, eg, charity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date and time at which a given organisation was officially registered.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#RegistrationDate
	 * Organisation12.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#RegistrationDate
	 * OrganisationModification1.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#RegistrationDate
	 * LegalOrganisation2.RegistrationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation12.RegistrationDate, com.tools20022.repository.msg.OrganisationModification1.RegistrationDate,
					com.tools20022.repository.msg.LegalOrganisation2.RegistrationDate);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specific identification assigned to an organisation. It is derived from
	 * the association between Party and PartyIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#Organisation
	 * OrganisationIdentification.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#FinancialInstitutionIdentification
	 * BranchAndFinancialInstitutionIdentification5.
	 * FinancialInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#BranchIdentification
	 * BranchAndFinancialInstitutionIdentification5.BranchIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#Servicer
	 * CashAccount25.Servicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#OrganisationIdentification
	 * Organisation12.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation14#OrganisationIdentification
	 * Organisation14.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#OrganisationIdentification
	 * OrganisationModification1.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport15#TransferAccountServicerIdentification
	 * AccountReport15.TransferAccountServicerIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Agent
	 * ChargesRecord1.Agent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#DebtorAgent
	 * TransactionAgents3.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#CreditorAgent
	 * TransactionAgents3.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#IntermediaryAgent1
	 * TransactionAgents3.IntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#IntermediaryAgent2
	 * TransactionAgents3.IntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#IntermediaryAgent3
	 * TransactionAgents3.IntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#ReceivingAgent
	 * TransactionAgents3.ReceivingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#DeliveringAgent
	 * TransactionAgents3.DeliveringAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#IssuingAgent
	 * TransactionAgents3.IssuingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#SettlementPlace
	 * TransactionAgents3.SettlementPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#Proprietary
	 * TransactionAgents3.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Agent
	 * ChargesRecord2.Agent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#ForwardingAgent
	 * GroupHeader48.ForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#ForwardingAgent
	 * GroupHeader55.ForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#InstructingReimbursementAgent
	 * SettlementInstruction4.InstructingReimbursementAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#ForwardingAgent
	 * GroupHeader56.ForwardingAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader56#DebtorAgent
	 * GroupHeader56.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#CreditorAgent
	 * GroupHeader56.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#ForwardingAgent
	 * GroupHeader52.ForwardingAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader52#DebtorAgent
	 * GroupHeader52.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#CreditorAgent
	 * GroupHeader52.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#InstructingAgent
	 * GroupHeader50.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#InstructedAgent
	 * GroupHeader50.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#InstructingAgent
	 * GroupHeader53.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#InstructedAgent
	 * GroupHeader53.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#InstructingAgent
	 * GroupHeader47.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#InstructedAgent
	 * GroupHeader47.InstructedAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader46#DebtorAgent
	 * GroupHeader46.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#CreditorAgent
	 * GroupHeader46.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#FirstAgent
	 * PaymentIdentification4.FirstAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation2#Agent
	 * IdentificationInformation2.Agent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#AccountServicer
	 * ReportingRequest3.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#InstructingReimbursementAgent
	 * SettlementInstruction3.InstructingReimbursementAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#InstructingAgent
	 * GroupHeader63.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#InstructedAgent
	 * GroupHeader63.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#DebtorAgent
	 * DirectDebitTransactionInformation15.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#InstructingAgent
	 * CreditTransferTransaction9.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#InstructedAgent
	 * CreditTransferTransaction9.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#IntermediaryAgent1
	 * CreditTransferTransaction9.IntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#IntermediaryAgent2
	 * CreditTransferTransaction9.IntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#IntermediaryAgent3
	 * CreditTransferTransaction9.IntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#CreditorAgent
	 * CreditTransferTransaction9.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#Creditor
	 * CreditTransferTransaction9.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#UltimateCreditor
	 * CreditTransferTransaction9.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#ForwardingAgent
	 * GroupHeader62.ForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#PreviousInstructingAgent
	 * CreditTransferTransaction23.PreviousInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InstructingAgent
	 * CreditTransferTransaction23.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InstructedAgent
	 * CreditTransferTransaction23.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#IntermediaryAgent1
	 * CreditTransferTransaction23.IntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#IntermediaryAgent2
	 * CreditTransferTransaction23.IntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#IntermediaryAgent3
	 * CreditTransferTransaction23.IntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#CreditorAgent
	 * CreditTransferTransaction23.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#InstructingAgent
	 * GroupHeader70.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#InstructedAgent
	 * GroupHeader70.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#DebtorAgent
	 * AccountNotification13.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#IntermediaryAgent
	 * AccountNotification13.IntermediaryAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#PreviousInstructingAgent
	 * CreditTransferTransaction25.PreviousInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InstructingAgent
	 * CreditTransferTransaction25.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InstructedAgent
	 * CreditTransferTransaction25.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#IntermediaryAgent1
	 * CreditTransferTransaction25.IntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#IntermediaryAgent2
	 * CreditTransferTransaction25.IntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#IntermediaryAgent3
	 * CreditTransferTransaction25.IntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#CreditorAgent
	 * CreditTransferTransaction25.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#InstructingAgent
	 * GroupHeader72.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#InstructedAgent
	 * GroupHeader72.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#InstructingAgent
	 * GroupHeader71.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#InstructedAgent
	 * GroupHeader71.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#AccountServicer
	 * OriginalNotificationReference8.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#DebtorAgent
	 * OriginalNotificationReference8.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#IntermediaryAgent
	 * OriginalNotificationReference8.IntermediaryAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#PreviousInstructingAgent
	 * CreditTransferTransaction24.PreviousInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#IntermediaryAgent1
	 * CreditTransferTransaction24.IntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#IntermediaryAgent2
	 * CreditTransferTransaction24.IntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#IntermediaryAgent3
	 * CreditTransferTransaction24.IntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#CreditorAgent
	 * CreditTransferTransaction24.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#IntermediaryAgent1
	 * CreditTransferTransaction26.IntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#IntermediaryAgent2
	 * CreditTransferTransaction26.IntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#IntermediaryAgent3
	 * CreditTransferTransaction26.IntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#CreditorAgent
	 * CreditTransferTransaction26.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#AccountServicer
	 * OriginalItemReference4.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#IntermediaryAgent1
	 * CreditTransferTransaction22.IntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#IntermediaryAgent2
	 * CreditTransferTransaction22.IntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#IntermediaryAgent3
	 * CreditTransferTransaction22.IntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#CreditorAgent
	 * CreditTransferTransaction22.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#AccountServicer
	 * OriginalNotificationReference7.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#DebtorAgent
	 * OriginalNotificationReference7.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#IntermediaryAgent
	 * OriginalNotificationReference7.IntermediaryAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#AccountServicer
	 * NotificationItem6.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#DebtorAgent
	 * NotificationItem6.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#IntermediaryAgent
	 * NotificationItem6.IntermediaryAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#InstructingAgent
	 * PaymentTransaction73.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#InstructedAgent
	 * PaymentTransaction73.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#ChargesAccountAgent
	 * PaymentInstruction21.ChargesAccountAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#CreditorAgent
	 * DirectDebitTransactionInformation21.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#InstructingAgent
	 * DirectDebitTransactionInformation21.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#InstructedAgent
	 * DirectDebitTransactionInformation21.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#IntermediaryAgent1
	 * DirectDebitTransactionInformation21.IntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#IntermediaryAgent2
	 * DirectDebitTransactionInformation21.IntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#IntermediaryAgent3
	 * DirectDebitTransactionInformation21.IntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#DebtorAgent
	 * DirectDebitTransactionInformation21.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#InstructingAgent
	 * PaymentTransaction80.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#InstructedAgent
	 * PaymentTransaction80.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#InstructingAgent
	 * PaymentTransaction81.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#InstructedAgent
	 * PaymentTransaction81.InstructedAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#CreditorAgent
	 * Mandate10.CreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#DebtorAgent
	 * Mandate10.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#DebtorAgent
	 * PaymentInstruction23.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#InstructingAgent
	 * PaymentTransaction76.InstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#InstructedAgent
	 * PaymentTransaction76.InstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#DebtorAgent
	 * PaymentInstruction22.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#ChargesAccountAgent
	 * PaymentInstruction22.ChargesAccountAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#CreditorAgent
	 * Mandate9.CreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#DebtorAgent
	 * Mandate9.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#DebtorAgent
	 * OriginalTransactionReference26.DebtorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#CreditorAgent
	 * Mandate11.CreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#DebtorAgent
	 * Mandate11.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#DebtorAgent
	 * DirectDebitTransactionInformation22.DebtorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#CreditorAgent
	 * Mandate8.CreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#DebtorAgent
	 * Mandate8.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#Assigner
	 * PaymentTransaction75.Assigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#Assignee
	 * PaymentTransaction75.Assignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalCreditorAgent
	 * AmendmentInformationDetails11.OriginalCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalDebtorAgent
	 * AmendmentInformationDetails11.OriginalDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#DebtorAgent
	 * PaymentComplementaryInformation6.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#IntermediaryAgent1
	 * PaymentComplementaryInformation6.IntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#IntermediaryAgent2
	 * PaymentComplementaryInformation6.IntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#IntermediaryAgent3
	 * PaymentComplementaryInformation6.IntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#PreviousInstructingAgent
	 * PaymentComplementaryInformation6.PreviousInstructingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.FinancialInstitutionIdentification,
					com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.BranchIdentification, com.tools20022.repository.msg.CashAccount25.Servicer,
					com.tools20022.repository.msg.Organisation12.OrganisationIdentification, com.tools20022.repository.msg.Organisation14.OrganisationIdentification,
					com.tools20022.repository.msg.OrganisationModification1.OrganisationIdentification, com.tools20022.repository.msg.AccountReport15.TransferAccountServicerIdentification,
					com.tools20022.repository.msg.ChargesRecord1.Agent, com.tools20022.repository.msg.TransactionAgents3.DebtorAgent, com.tools20022.repository.msg.TransactionAgents3.CreditorAgent,
					com.tools20022.repository.msg.TransactionAgents3.IntermediaryAgent1, com.tools20022.repository.msg.TransactionAgents3.IntermediaryAgent2, com.tools20022.repository.msg.TransactionAgents3.IntermediaryAgent3,
					com.tools20022.repository.msg.TransactionAgents3.ReceivingAgent, com.tools20022.repository.msg.TransactionAgents3.DeliveringAgent, com.tools20022.repository.msg.TransactionAgents3.IssuingAgent,
					com.tools20022.repository.msg.TransactionAgents3.SettlementPlace, com.tools20022.repository.msg.TransactionAgents3.Proprietary, com.tools20022.repository.msg.ChargesRecord2.Agent,
					com.tools20022.repository.msg.GroupHeader48.ForwardingAgent, com.tools20022.repository.msg.GroupHeader55.ForwardingAgent, com.tools20022.repository.msg.SettlementInstruction4.InstructingReimbursementAgent,
					com.tools20022.repository.msg.GroupHeader56.ForwardingAgent, com.tools20022.repository.msg.GroupHeader56.DebtorAgent, com.tools20022.repository.msg.GroupHeader56.CreditorAgent,
					com.tools20022.repository.msg.GroupHeader52.ForwardingAgent, com.tools20022.repository.msg.GroupHeader52.DebtorAgent, com.tools20022.repository.msg.GroupHeader52.CreditorAgent,
					com.tools20022.repository.msg.GroupHeader50.InstructingAgent, com.tools20022.repository.msg.GroupHeader50.InstructedAgent, com.tools20022.repository.msg.GroupHeader53.InstructingAgent,
					com.tools20022.repository.msg.GroupHeader53.InstructedAgent, com.tools20022.repository.msg.GroupHeader47.InstructingAgent, com.tools20022.repository.msg.GroupHeader47.InstructedAgent,
					com.tools20022.repository.msg.GroupHeader46.DebtorAgent, com.tools20022.repository.msg.GroupHeader46.CreditorAgent, com.tools20022.repository.msg.PaymentIdentification4.FirstAgent,
					com.tools20022.repository.msg.IdentificationInformation2.Agent, com.tools20022.repository.msg.ReportingRequest3.AccountServicer, com.tools20022.repository.msg.SettlementInstruction3.InstructingReimbursementAgent,
					com.tools20022.repository.msg.GroupHeader63.InstructingAgent, com.tools20022.repository.msg.GroupHeader63.InstructedAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation15.DebtorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction9.InstructingAgent, com.tools20022.repository.msg.CreditTransferTransaction9.InstructedAgent,
					com.tools20022.repository.msg.CreditTransferTransaction9.IntermediaryAgent1, com.tools20022.repository.msg.CreditTransferTransaction9.IntermediaryAgent2,
					com.tools20022.repository.msg.CreditTransferTransaction9.IntermediaryAgent3, com.tools20022.repository.msg.CreditTransferTransaction9.CreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction9.Creditor,
					com.tools20022.repository.msg.CreditTransferTransaction9.UltimateCreditor, com.tools20022.repository.msg.GroupHeader62.ForwardingAgent, com.tools20022.repository.msg.CreditTransferTransaction23.PreviousInstructingAgent,
					com.tools20022.repository.msg.CreditTransferTransaction23.InstructingAgent, com.tools20022.repository.msg.CreditTransferTransaction23.InstructedAgent,
					com.tools20022.repository.msg.CreditTransferTransaction23.IntermediaryAgent1, com.tools20022.repository.msg.CreditTransferTransaction23.IntermediaryAgent2,
					com.tools20022.repository.msg.CreditTransferTransaction23.IntermediaryAgent3, com.tools20022.repository.msg.CreditTransferTransaction23.CreditorAgent, com.tools20022.repository.msg.GroupHeader70.InstructingAgent,
					com.tools20022.repository.msg.GroupHeader70.InstructedAgent, com.tools20022.repository.msg.AccountNotification13.DebtorAgent, com.tools20022.repository.msg.AccountNotification13.IntermediaryAgent,
					com.tools20022.repository.msg.CreditTransferTransaction25.PreviousInstructingAgent, com.tools20022.repository.msg.CreditTransferTransaction25.InstructingAgent,
					com.tools20022.repository.msg.CreditTransferTransaction25.InstructedAgent, com.tools20022.repository.msg.CreditTransferTransaction25.IntermediaryAgent1,
					com.tools20022.repository.msg.CreditTransferTransaction25.IntermediaryAgent2, com.tools20022.repository.msg.CreditTransferTransaction25.IntermediaryAgent3,
					com.tools20022.repository.msg.CreditTransferTransaction25.CreditorAgent, com.tools20022.repository.msg.GroupHeader72.InstructingAgent, com.tools20022.repository.msg.GroupHeader72.InstructedAgent,
					com.tools20022.repository.msg.GroupHeader71.InstructingAgent, com.tools20022.repository.msg.GroupHeader71.InstructedAgent, com.tools20022.repository.msg.OriginalNotificationReference8.AccountServicer,
					com.tools20022.repository.msg.OriginalNotificationReference8.DebtorAgent, com.tools20022.repository.msg.OriginalNotificationReference8.IntermediaryAgent,
					com.tools20022.repository.msg.CreditTransferTransaction24.PreviousInstructingAgent, com.tools20022.repository.msg.CreditTransferTransaction24.IntermediaryAgent1,
					com.tools20022.repository.msg.CreditTransferTransaction24.IntermediaryAgent2, com.tools20022.repository.msg.CreditTransferTransaction24.IntermediaryAgent3,
					com.tools20022.repository.msg.CreditTransferTransaction24.CreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent1,
					com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent2, com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent3,
					com.tools20022.repository.msg.CreditTransferTransaction26.CreditorAgent, com.tools20022.repository.msg.OriginalItemReference4.AccountServicer,
					com.tools20022.repository.msg.CreditTransferTransaction22.IntermediaryAgent1, com.tools20022.repository.msg.CreditTransferTransaction22.IntermediaryAgent2,
					com.tools20022.repository.msg.CreditTransferTransaction22.IntermediaryAgent3, com.tools20022.repository.msg.CreditTransferTransaction22.CreditorAgent,
					com.tools20022.repository.msg.OriginalNotificationReference7.AccountServicer, com.tools20022.repository.msg.OriginalNotificationReference7.DebtorAgent,
					com.tools20022.repository.msg.OriginalNotificationReference7.IntermediaryAgent, com.tools20022.repository.msg.NotificationItem6.AccountServicer, com.tools20022.repository.msg.NotificationItem6.DebtorAgent,
					com.tools20022.repository.msg.NotificationItem6.IntermediaryAgent, com.tools20022.repository.msg.PaymentTransaction73.InstructingAgent, com.tools20022.repository.msg.PaymentTransaction73.InstructedAgent,
					com.tools20022.repository.msg.PaymentInstruction21.ChargesAccountAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation21.CreditorAgent,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.InstructingAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation21.InstructedAgent,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.IntermediaryAgent1, com.tools20022.repository.msg.DirectDebitTransactionInformation21.IntermediaryAgent2,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.IntermediaryAgent3, com.tools20022.repository.msg.DirectDebitTransactionInformation21.DebtorAgent,
					com.tools20022.repository.msg.PaymentTransaction80.InstructingAgent, com.tools20022.repository.msg.PaymentTransaction80.InstructedAgent, com.tools20022.repository.msg.PaymentTransaction81.InstructingAgent,
					com.tools20022.repository.msg.PaymentTransaction81.InstructedAgent, com.tools20022.repository.msg.Mandate10.CreditorAgent, com.tools20022.repository.msg.Mandate10.DebtorAgent,
					com.tools20022.repository.msg.PaymentInstruction23.DebtorAgent, com.tools20022.repository.msg.PaymentTransaction76.InstructingAgent, com.tools20022.repository.msg.PaymentTransaction76.InstructedAgent,
					com.tools20022.repository.msg.PaymentInstruction22.DebtorAgent, com.tools20022.repository.msg.PaymentInstruction22.ChargesAccountAgent, com.tools20022.repository.msg.Mandate9.CreditorAgent,
					com.tools20022.repository.msg.Mandate9.DebtorAgent, com.tools20022.repository.msg.OriginalTransactionReference26.DebtorAgent, com.tools20022.repository.msg.Mandate11.CreditorAgent,
					com.tools20022.repository.msg.Mandate11.DebtorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation22.DebtorAgent, com.tools20022.repository.msg.Mandate8.CreditorAgent,
					com.tools20022.repository.msg.Mandate8.DebtorAgent, com.tools20022.repository.msg.PaymentTransaction75.Assigner, com.tools20022.repository.msg.PaymentTransaction75.Assignee,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalCreditorAgent, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtorAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.DebtorAgent, com.tools20022.repository.msg.PaymentComplementaryInformation6.IntermediaryAgent1,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.IntermediaryAgent2, com.tools20022.repository.msg.PaymentComplementaryInformation6.IntermediaryAgent3,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.PreviousInstructingAgent);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Organisation which is divided in branches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#Branch
	 * Organisation.Branch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation which is divided in branches."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ParentOrganisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentOrganisation";
			definition = "Organisation which is divided in branches.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.Branch;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies an organisation which is not a head office.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#ParentOrganisation
	 * Organisation.ParentOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Branch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies an organisation which is not a head office."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Branch = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Branch";
			definition = "Specifies an organisation which is not a head office.";
			minOccurs = 0;
			type_lazy = () -> Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.ParentOrganisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the process which originates the changes to an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewOrganisationInformation
	 * SecuritiesModification.NewOrganisationInformation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the process which originates the changes to an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesModification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Specifies the process which originates the changes to an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.NewOrganisationInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place (including country) in which the organisation has its business
	 * activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#OperatingOrganisation
	 * Location.OperatingOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (including country) in which the organisation has its business activity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfOperation";
			definition = "Place (including country) in which the organisation has its business activity.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.OperatingOrganisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place (including country) in which the organisation is registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#RegisteredOrganisation
	 * Location.RegisteredOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (including country) in which the organisation is registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfRegistration";
			definition = "Place (including country) in which the organisation is registered.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.RegisteredOrganisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Description of an organisation.
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
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Legal standing of the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalStructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal standing of the organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LegalStructure = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalStructure";
			definition = "Legal standing of the organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LegalStructureCode.mmObject();
		}
	};
	/**
	 * Sector of business of the organisation, for example, pharmaceutical.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Sector#Organisation
	 * Sector.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sector of business of the organisation, for example, pharmaceutical."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Sector = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Sector of business of the organisation, for example, pharmaceutical.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of interest process for which a list of organisations is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#Organisations
	 * BuyOrSellIndicationOfInterest.Organisations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process for which a list of organisations is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a list of organisations is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Organisations;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Strategy related to an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#Organisation
	 * OrganisationStrategy.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy
	 * OrganisationStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy related to an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to an organisation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OrganisationStrategy.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationStrategy.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Description of the structure of a company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#Organisation
	 * OrganisationHierarchy.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy
	 * OrganisationHierarchy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationHierarchy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the structure of a company."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrganisationHierarchy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationHierarchy";
			definition = "Description of the structure of a company.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Officer who has some rights to represent a given organisation. In account
	 * management, it is the person to be contacted by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#Organisation
	 * RepresentativeOfficer.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer
	 * RepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepresentativeOfficer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RepresentativeOfficer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date when the organisation was established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#EstablishmentDate
	 * LegalOrganisation2.EstablishmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstablishmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the organisation was established."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EstablishmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LegalOrganisation2.EstablishmentDate);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstablishmentDate";
			definition = "Date when the organisation was established.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Organisation";
				definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.ParentOrganisation, com.tools20022.repository.entity.Organisation.Branch,
						com.tools20022.repository.entity.OrganisationIdentification.Organisation, com.tools20022.repository.entity.Location.OperatingOrganisation, com.tools20022.repository.entity.Location.RegisteredOrganisation,
						com.tools20022.repository.entity.SecuritiesModification.NewOrganisationInformation, com.tools20022.repository.entity.Sector.Organisation, com.tools20022.repository.entity.RepresentativeOfficer.Organisation,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Organisations, com.tools20022.repository.entity.OrganisationStrategy.Organisation, com.tools20022.repository.entity.OrganisationHierarchy.Organisation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeParty2.LegalOrganisation, com.tools20022.repository.msg.OriginalItemReference4.DebtorAgent,
						com.tools20022.repository.msg.OriginalItemReference4.IntermediaryAgent, com.tools20022.repository.msg.OriginalPaymentInformation7.DebtorAgent, com.tools20022.repository.msg.OriginalPaymentInformation7.CreditorAgent);
				subType_lazy = () -> Arrays.asList(FinancialInstitution.mmObject());
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.Purpose, com.tools20022.repository.entity.Organisation.RegistrationDate,
						com.tools20022.repository.entity.Organisation.OrganisationIdentification, com.tools20022.repository.entity.Organisation.ParentOrganisation, com.tools20022.repository.entity.Organisation.Branch,
						com.tools20022.repository.entity.Organisation.SecuritiesModification, com.tools20022.repository.entity.Organisation.PlaceOfOperation, com.tools20022.repository.entity.Organisation.PlaceOfRegistration,
						com.tools20022.repository.entity.Organisation.Description, com.tools20022.repository.entity.Organisation.LegalStructure, com.tools20022.repository.entity.Organisation.Sector,
						com.tools20022.repository.entity.Organisation.RelatedIndicationOfInterest, com.tools20022.repository.entity.Organisation.Strategy, com.tools20022.repository.entity.Organisation.OrganisationHierarchy,
						com.tools20022.repository.entity.Organisation.RepresentativeOfficer, com.tools20022.repository.entity.Organisation.EstablishmentDate);
				derivationComponent_lazy = () -> Arrays.asList(BranchAndFinancialInstitutionIdentification5.mmObject(), Organisation12.mmObject(), Organisation14.mmObject(), OrganisationModification1.mmObject(),
						LegalOrganisation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}