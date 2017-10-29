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
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.msg.PartyAndAuthorisation1;
import com.tools20022.repository.msg.PartyAndAuthorisation3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Party" src="doc-files/Party.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party#ContactPoint
 * Party.ContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Identification
 * Party.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#MoneyLaunderingCheck
 * Party.MoneyLaunderingCheck}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#TaxationConditions
 * Party.TaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Domicile
 * Party.Domicile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Residence
 * Party.Residence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#PowerOfAttorney
 * Party.PowerOfAttorney}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Location
 * Party.Location}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#CloseLinkSecurity
 * Party.CloseLinkSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CloseLink
 * Security.CloseLink}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#RelatedParty
 * ContactPoint.RelatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedParty
 * PartyIdentificationInformation.IdentifiedParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#DomiciledParty
 * Location.DomiciledParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Party
 * Location.Party}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#TaxableParty
 * Location.TaxableParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxableParty
 * Tax.TaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedParty
 * PowerOfAttorney.AuthorisedParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#PartyOrGroup
 * PartyAndAuthorisation1.PartyOrGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#PartyOrGroup
 * PartyAndAuthorisation3.PartyOrGroup}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person Person}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
 * PartyAndAuthorisation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3
 * PartyAndAuthorisation3}</li>
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
 * "Party"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
public class Party extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number, physical or virtual address, used for communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedParty
	 * ContactPoint.RelatedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#ContactDetails
	 * PartyIdentification43.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#ContactDetails
	 * PartyIdentification40.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#PreferredMethod
	 * ContactDetails3.PreferredMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#ContactDetails
	 * PartyIdentification58.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountTax1#NonResidenceCountry
	 * AccountTax1.NonResidenceCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#ContactDetails
	 * PartyIdentification77.ContactDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number, physical or virtual address, used for communication."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ContactPoint = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification43.ContactDetails, com.tools20022.repository.msg.PartyIdentification40.ContactDetails,
					com.tools20022.repository.msg.ContactDetails3.PreferredMethod, com.tools20022.repository.msg.PartyIdentification58.ContactDetails, com.tools20022.repository.msg.AccountTax1.NonResidenceCountry,
					com.tools20022.repository.msg.PartyIdentification77.ContactDetails);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Number, physical or virtual address, used for communication.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specific identification assigned to a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedParty
	 * PartyIdentificationInformation.IdentifiedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#Owner
	 * CashAccount25.Owner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2#Party
	 * PartyAndSignature2.Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#RepresentativeOfficer
	 * Organisation12.RepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#TreasuryManager
	 * Organisation12.TreasuryManager}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#MainMandateHolder
	 * Organisation12.MainMandateHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#LegalRepresentative
	 * Organisation12.LegalRepresentative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#RepresentativeOfficer
	 * OrganisationModification1.RepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#TreasuryManager
	 * OrganisationModification1.TreasuryManager}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#MainMandateHolder
	 * OrganisationModification1.MainMandateHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#LegalRepresentative
	 * OrganisationModification1.LegalRepresentative}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyAndCertificate2#Party
	 * PartyAndCertificate2.Party}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyAndCertificate3#Party
	 * PartyAndCertificate3.Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#InitiatingParty
	 * TransactionParties3.InitiatingParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionParties3#Debtor
	 * TransactionParties3.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#UltimateDebtor
	 * TransactionParties3.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#Creditor
	 * TransactionParties3.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#UltimateCreditor
	 * TransactionParties3.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#TradingParty
	 * TransactionParties3.TradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#InitiatingParty
	 * GroupHeader48.InitiatingParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#ChequeFrom
	 * Cheque7.ChequeFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#InitiatingParty
	 * GroupHeader55.InitiatingParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3#Assigner
	 * CaseAssignment3.Assigner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3#Assignee
	 * CaseAssignment3.Assignee}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Case3#Creator
	 * Case3.Creator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#ThirdReimbursementAgent
	 * SettlementInstruction4.ThirdReimbursementAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#InitiatingParty
	 * GroupHeader56.InitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason7#Originator
	 * PaymentReversalReason7.Originator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#InitiatingParty
	 * GroupHeader52.InitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#Originator
	 * StatusReasonInformation9.Originator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#InitiatingParty
	 * GroupHeader47.InitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendmentReason1#Originator
	 * MandateAmendmentReason1.Originator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason1#Originator
	 * PaymentCancellationReason1.Originator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#InitiatingParty
	 * GroupHeader46.InitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#InitiatingParty
	 * GroupHeader45.InitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation2#Party
	 * IdentificationInformation2.Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#AccountOwner
	 * ReportingRequest3.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#Originator
	 * CancellationStatusReason2.Originator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#UltimateDebtor
	 * DirectDebitTransactionInformation15.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#Debtor
	 * DirectDebitTransactionInformation15.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#InitiatingParty
	 * GroupHeader62.InitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#GarnishmentAdministrator
	 * Garnishment1.GarnishmentAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#CreditorSchemeIdentification
	 * TransactionReferences4.CreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#UltimateDebtor
	 * TaxInformation4.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeParty2#PartyIdentification
	 * TradeParty2.PartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#UltimateDebtor
	 * CreditTransferTransaction23.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#Debtor
	 * CreditTransferTransaction23.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#DebtorAgent
	 * CreditTransferTransaction23.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#Creditor
	 * CreditTransferTransaction23.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#UltimateCreditor
	 * CreditTransferTransaction23.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#AccountOwner
	 * AccountNotification13.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#AccountServicer
	 * AccountNotification13.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#Debtor
	 * AccountNotification13.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#UltimateDebtor
	 * CreditTransferTransaction25.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InitiatingParty
	 * CreditTransferTransaction25.InitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#Debtor
	 * CreditTransferTransaction25.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#DebtorAgent
	 * CreditTransferTransaction25.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#Creditor
	 * CreditTransferTransaction25.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#UltimateCreditor
	 * CreditTransferTransaction25.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#AccountOwner
	 * OriginalNotificationReference8.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#Debtor
	 * OriginalNotificationReference8.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#UltimateDebtor
	 * CreditTransferTransaction24.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#InitiatingParty
	 * CreditTransferTransaction24.InitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#Debtor
	 * CreditTransferTransaction24.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#DebtorAgent
	 * CreditTransferTransaction24.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#Creditor
	 * CreditTransferTransaction24.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#UltimateCreditor
	 * CreditTransferTransaction24.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#UltimateDebtor
	 * CreditTransferTransaction26.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#Creditor
	 * CreditTransferTransaction26.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#UltimateCreditor
	 * CreditTransferTransaction26.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#Invoicer
	 * StructuredRemittanceInformation13.Invoicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#AccountOwner
	 * OriginalItemReference4.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#Debtor
	 * OriginalItemReference4.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#UltimateDebtor
	 * CreditTransferTransaction22.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#Creditor
	 * CreditTransferTransaction22.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#UltimateCreditor
	 * CreditTransferTransaction22.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#AccountOwner
	 * OriginalNotificationReference7.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#Debtor
	 * OriginalNotificationReference7.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#AccountOwner
	 * NotificationItem6.AccountOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#Debtor
	 * NotificationItem6.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#Creditor
	 * PaymentInstruction21.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#CreditorAgent
	 * PaymentInstruction21.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#UltimateCreditor
	 * PaymentInstruction21.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#CreditorSchemeIdentification
	 * PaymentInstruction21.CreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#Creditor
	 * DirectDebitTransactionInformation21.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#UltimateCreditor
	 * DirectDebitTransactionInformation21.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#InitiatingParty
	 * DirectDebitTransactionInformation21.InitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#Debtor
	 * DirectDebitTransactionInformation21.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#UltimateDebtor
	 * DirectDebitTransactionInformation21.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason3#Originator
	 * PaymentCancellationReason3.Originator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#CreditorSchemeIdentification
	 * Mandate10.CreditorSchemeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Creditor
	 * Mandate10.Creditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#UltimateCreditor
	 * Mandate10.UltimateCreditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Debtor
	 * Mandate10.Debtor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#UltimateDebtor
	 * Mandate10.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#Debtor
	 * RequestedModification6.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#Creditor
	 * RequestedModification6.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#Debtor
	 * PaymentInstruction23.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#UltimateDebtor
	 * PaymentInstruction23.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#Debtor
	 * PaymentInstruction22.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#UltimateDebtor
	 * PaymentInstruction22.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#CreditorSchemeIdentification
	 * Mandate9.CreditorSchemeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Creditor
	 * Mandate9.Creditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#UltimateCreditor
	 * Mandate9.UltimateCreditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Debtor
	 * Mandate9.Debtor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#UltimateDebtor
	 * Mandate9.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#CreditorSchemeIdentification
	 * OriginalTransactionReference24.CreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#UltimateDebtor
	 * OriginalTransactionReference24.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#Debtor
	 * OriginalTransactionReference24.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#DebtorAgent
	 * OriginalTransactionReference24.DebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#CreditorAgent
	 * OriginalTransactionReference24.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#Creditor
	 * OriginalTransactionReference24.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#UltimateCreditor
	 * OriginalTransactionReference24.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#Debtor
	 * OriginalPaymentInformation7.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#Creditor
	 * OriginalPaymentInformation7.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#UltimateDebtor
	 * OriginalTransactionReference26.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#Debtor
	 * OriginalTransactionReference26.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#CreditorAgent
	 * OriginalTransactionReference26.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#Creditor
	 * OriginalTransactionReference26.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#UltimateCreditor
	 * OriginalTransactionReference26.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#CreditorSchemeIdentification
	 * Mandate11.CreditorSchemeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Creditor
	 * Mandate11.Creditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#UltimateCreditor
	 * Mandate11.UltimateCreditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Debtor
	 * Mandate11.Debtor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#UltimateDebtor
	 * Mandate11.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#UltimateCreditor
	 * DirectDebitTransactionInformation22.UltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#Debtor
	 * DirectDebitTransactionInformation22.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#UltimateDebtor
	 * DirectDebitTransactionInformation22.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#CreditorSchemeIdentification
	 * DirectDebitTransaction9.CreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#CreditorSchemeIdentification
	 * Mandate8.CreditorSchemeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Creditor
	 * Mandate8.Creditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#UltimateCreditor
	 * Mandate8.UltimateCreditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Debtor
	 * Mandate8.Debtor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#UltimateDebtor
	 * Mandate8.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalCreditorSchemeIdentification
	 * AmendmentInformationDetails11.OriginalCreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalDebtor
	 * AmendmentInformationDetails11.OriginalDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#Assigner
	 * PaymentTransaction79.Assigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#Assignee
	 * PaymentTransaction79.Assignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#UltimateDebtor
	 * PaymentComplementaryInformation6.UltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#Debtor
	 * PaymentComplementaryInformation6.Debtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#CreditorAgent
	 * PaymentComplementaryInformation6.CreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#Creditor
	 * PaymentComplementaryInformation6.Creditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#UltimateCreditor
	 * PaymentComplementaryInformation6.UltimateCreditor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific identification assigned to a party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount25.Owner, com.tools20022.repository.msg.PartyAndSignature2.Party, com.tools20022.repository.msg.Organisation12.RepresentativeOfficer,
					com.tools20022.repository.msg.Organisation12.TreasuryManager, com.tools20022.repository.msg.Organisation12.MainMandateHolder, com.tools20022.repository.msg.Organisation12.LegalRepresentative,
					com.tools20022.repository.msg.OrganisationModification1.RepresentativeOfficer, com.tools20022.repository.msg.OrganisationModification1.TreasuryManager,
					com.tools20022.repository.msg.OrganisationModification1.MainMandateHolder, com.tools20022.repository.msg.OrganisationModification1.LegalRepresentative, com.tools20022.repository.msg.PartyAndCertificate2.Party,
					com.tools20022.repository.msg.PartyAndCertificate3.Party, com.tools20022.repository.msg.TransactionParties3.InitiatingParty, com.tools20022.repository.msg.TransactionParties3.Debtor,
					com.tools20022.repository.msg.TransactionParties3.UltimateDebtor, com.tools20022.repository.msg.TransactionParties3.Creditor, com.tools20022.repository.msg.TransactionParties3.UltimateCreditor,
					com.tools20022.repository.msg.TransactionParties3.TradingParty, com.tools20022.repository.msg.GroupHeader48.InitiatingParty, com.tools20022.repository.msg.Cheque7.ChequeFrom,
					com.tools20022.repository.msg.GroupHeader55.InitiatingParty, com.tools20022.repository.msg.CaseAssignment3.Assigner, com.tools20022.repository.msg.CaseAssignment3.Assignee, com.tools20022.repository.msg.Case3.Creator,
					com.tools20022.repository.msg.SettlementInstruction4.ThirdReimbursementAgent, com.tools20022.repository.msg.GroupHeader56.InitiatingParty, com.tools20022.repository.msg.PaymentReversalReason7.Originator,
					com.tools20022.repository.msg.GroupHeader52.InitiatingParty, com.tools20022.repository.msg.StatusReasonInformation9.Originator, com.tools20022.repository.msg.GroupHeader47.InitiatingParty,
					com.tools20022.repository.msg.MandateAmendmentReason1.Originator, com.tools20022.repository.msg.PaymentCancellationReason1.Originator, com.tools20022.repository.msg.GroupHeader46.InitiatingParty,
					com.tools20022.repository.msg.GroupHeader45.InitiatingParty, com.tools20022.repository.msg.IdentificationInformation2.Party, com.tools20022.repository.msg.ReportingRequest3.AccountOwner,
					com.tools20022.repository.msg.CancellationStatusReason2.Originator, com.tools20022.repository.msg.DirectDebitTransactionInformation15.UltimateDebtor,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.Debtor, com.tools20022.repository.msg.GroupHeader62.InitiatingParty, com.tools20022.repository.msg.Garnishment1.GarnishmentAdministrator,
					com.tools20022.repository.msg.TransactionReferences4.CreditorSchemeIdentification, com.tools20022.repository.msg.TaxInformation4.UltimateDebtor, com.tools20022.repository.msg.TradeParty2.PartyIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction23.UltimateDebtor, com.tools20022.repository.msg.CreditTransferTransaction23.Debtor, com.tools20022.repository.msg.CreditTransferTransaction23.DebtorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction23.Creditor, com.tools20022.repository.msg.CreditTransferTransaction23.UltimateCreditor, com.tools20022.repository.msg.AccountNotification13.AccountOwner,
					com.tools20022.repository.msg.AccountNotification13.AccountServicer, com.tools20022.repository.msg.AccountNotification13.Debtor, com.tools20022.repository.msg.CreditTransferTransaction25.UltimateDebtor,
					com.tools20022.repository.msg.CreditTransferTransaction25.InitiatingParty, com.tools20022.repository.msg.CreditTransferTransaction25.Debtor, com.tools20022.repository.msg.CreditTransferTransaction25.DebtorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction25.Creditor, com.tools20022.repository.msg.CreditTransferTransaction25.UltimateCreditor, com.tools20022.repository.msg.OriginalNotificationReference8.AccountOwner,
					com.tools20022.repository.msg.OriginalNotificationReference8.Debtor, com.tools20022.repository.msg.CreditTransferTransaction24.UltimateDebtor, com.tools20022.repository.msg.CreditTransferTransaction24.InitiatingParty,
					com.tools20022.repository.msg.CreditTransferTransaction24.Debtor, com.tools20022.repository.msg.CreditTransferTransaction24.DebtorAgent, com.tools20022.repository.msg.CreditTransferTransaction24.Creditor,
					com.tools20022.repository.msg.CreditTransferTransaction24.UltimateCreditor, com.tools20022.repository.msg.CreditTransferTransaction26.UltimateDebtor, com.tools20022.repository.msg.CreditTransferTransaction26.Creditor,
					com.tools20022.repository.msg.CreditTransferTransaction26.UltimateCreditor, com.tools20022.repository.msg.StructuredRemittanceInformation13.Invoicer, com.tools20022.repository.msg.OriginalItemReference4.AccountOwner,
					com.tools20022.repository.msg.OriginalItemReference4.Debtor, com.tools20022.repository.msg.CreditTransferTransaction22.UltimateDebtor, com.tools20022.repository.msg.CreditTransferTransaction22.Creditor,
					com.tools20022.repository.msg.CreditTransferTransaction22.UltimateCreditor, com.tools20022.repository.msg.OriginalNotificationReference7.AccountOwner, com.tools20022.repository.msg.OriginalNotificationReference7.Debtor,
					com.tools20022.repository.msg.NotificationItem6.AccountOwner, com.tools20022.repository.msg.NotificationItem6.Debtor, com.tools20022.repository.msg.PaymentInstruction21.Creditor,
					com.tools20022.repository.msg.PaymentInstruction21.CreditorAgent, com.tools20022.repository.msg.PaymentInstruction21.UltimateCreditor, com.tools20022.repository.msg.PaymentInstruction21.CreditorSchemeIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.Creditor, com.tools20022.repository.msg.DirectDebitTransactionInformation21.UltimateCreditor,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.InitiatingParty, com.tools20022.repository.msg.DirectDebitTransactionInformation21.Debtor,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.UltimateDebtor, com.tools20022.repository.msg.PaymentCancellationReason3.Originator,
					com.tools20022.repository.msg.Mandate10.CreditorSchemeIdentification, com.tools20022.repository.msg.Mandate10.Creditor, com.tools20022.repository.msg.Mandate10.UltimateCreditor,
					com.tools20022.repository.msg.Mandate10.Debtor, com.tools20022.repository.msg.Mandate10.UltimateDebtor, com.tools20022.repository.msg.RequestedModification6.Debtor,
					com.tools20022.repository.msg.RequestedModification6.Creditor, com.tools20022.repository.msg.PaymentInstruction23.Debtor, com.tools20022.repository.msg.PaymentInstruction23.UltimateDebtor,
					com.tools20022.repository.msg.PaymentInstruction22.Debtor, com.tools20022.repository.msg.PaymentInstruction22.UltimateDebtor, com.tools20022.repository.msg.Mandate9.CreditorSchemeIdentification,
					com.tools20022.repository.msg.Mandate9.Creditor, com.tools20022.repository.msg.Mandate9.UltimateCreditor, com.tools20022.repository.msg.Mandate9.Debtor, com.tools20022.repository.msg.Mandate9.UltimateDebtor,
					com.tools20022.repository.msg.OriginalTransactionReference24.CreditorSchemeIdentification, com.tools20022.repository.msg.OriginalTransactionReference24.UltimateDebtor,
					com.tools20022.repository.msg.OriginalTransactionReference24.Debtor, com.tools20022.repository.msg.OriginalTransactionReference24.DebtorAgent, com.tools20022.repository.msg.OriginalTransactionReference24.CreditorAgent,
					com.tools20022.repository.msg.OriginalTransactionReference24.Creditor, com.tools20022.repository.msg.OriginalTransactionReference24.UltimateCreditor, com.tools20022.repository.msg.OriginalPaymentInformation7.Debtor,
					com.tools20022.repository.msg.OriginalPaymentInformation7.Creditor, com.tools20022.repository.msg.OriginalTransactionReference26.UltimateDebtor, com.tools20022.repository.msg.OriginalTransactionReference26.Debtor,
					com.tools20022.repository.msg.OriginalTransactionReference26.CreditorAgent, com.tools20022.repository.msg.OriginalTransactionReference26.Creditor,
					com.tools20022.repository.msg.OriginalTransactionReference26.UltimateCreditor, com.tools20022.repository.msg.Mandate11.CreditorSchemeIdentification, com.tools20022.repository.msg.Mandate11.Creditor,
					com.tools20022.repository.msg.Mandate11.UltimateCreditor, com.tools20022.repository.msg.Mandate11.Debtor, com.tools20022.repository.msg.Mandate11.UltimateDebtor,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.UltimateCreditor, com.tools20022.repository.msg.DirectDebitTransactionInformation22.Debtor,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.UltimateDebtor, com.tools20022.repository.msg.DirectDebitTransaction9.CreditorSchemeIdentification,
					com.tools20022.repository.msg.Mandate8.CreditorSchemeIdentification, com.tools20022.repository.msg.Mandate8.Creditor, com.tools20022.repository.msg.Mandate8.UltimateCreditor,
					com.tools20022.repository.msg.Mandate8.Debtor, com.tools20022.repository.msg.Mandate8.UltimateDebtor, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalCreditorSchemeIdentification,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtor, com.tools20022.repository.msg.PaymentTransaction79.Assigner, com.tools20022.repository.msg.PaymentTransaction79.Assignee,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.UltimateDebtor, com.tools20022.repository.msg.PaymentComplementaryInformation6.Debtor,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.CreditorAgent, com.tools20022.repository.msg.PaymentComplementaryInformation6.Creditor,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.UltimateCreditor);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specific identification assigned to a party.";
			minOccurs = 1;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of an identity check to prevent money laundering. This includes
	 * the counter-terrorism check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MoneyLaunderingCheck = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MoneyLaunderingCheckCode.mmObject();
		}
	};
	/**
	 * Taxation parameters which apply to an individual person or to an
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#TaxableParty
	 * Tax.TaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation parameters which apply to an individual person or to an organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxationConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Taxation parameters which apply to an individual person or to an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxableParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location in which a person is permanently domiciled (the place of a
	 * person's permanent home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#DomiciledParty
	 * Location.DomiciledParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location in which a person is permanently domiciled (the place of a person's permanent home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Domicile = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Domicile";
			definition = "Location in which a person is permanently domiciled (the place of a person's permanent home).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.DomiciledParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location from which the affairs of a company are directed or location in
	 * which a person resides (the place of a person's home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Location#Party
	 * Location.Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Residence = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Residence";
			definition = "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home).";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Party;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Power of attorney which is held by the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedParty
	 * PowerOfAttorney.AuthorisedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney which is held by the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney which is held by the party.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.AuthorisedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location of the taxable party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#TaxableParty
	 * Location.TaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location of the taxable party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location of the taxable party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.TaxableParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security for which a close link with a party is identified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#CloseLink
	 * Security.CloseLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseLinkSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security for which a close link with a party is identified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CloseLinkSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CloseLinkSecurity";
			definition = "Security for which a close link with a party is identified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CloseLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Party";
				definition = "Entity involved in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CloseLink, com.tools20022.repository.entity.ContactPoint.RelatedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedParty, com.tools20022.repository.entity.Location.DomiciledParty, com.tools20022.repository.entity.Location.Party,
						com.tools20022.repository.entity.Location.TaxableParty, com.tools20022.repository.entity.Tax.TaxableParty, com.tools20022.repository.entity.PowerOfAttorney.AuthorisedParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndAuthorisation1.PartyOrGroup, com.tools20022.repository.msg.PartyAndAuthorisation3.PartyOrGroup);
				subType_lazy = () -> Arrays.asList(Organisation.mmObject(), Person.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.ContactPoint, com.tools20022.repository.entity.Party.Identification, com.tools20022.repository.entity.Party.MoneyLaunderingCheck,
						com.tools20022.repository.entity.Party.TaxationConditions, com.tools20022.repository.entity.Party.Domicile, com.tools20022.repository.entity.Party.Residence, com.tools20022.repository.entity.Party.PowerOfAttorney,
						com.tools20022.repository.entity.Party.Location, com.tools20022.repository.entity.Party.CloseLinkSecurity);
				derivationComponent_lazy = () -> Arrays.asList(PartyAndAuthorisation1.mmObject(), PartyAndAuthorisation3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}