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
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmContactPoint
 * Party.mmContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmIdentification
 * Party.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
 * Party.mmMoneyLaunderingCheck}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
 * Party.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmDomicile
 * Party.mmDomicile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmResidence
 * Party.mmResidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmPowerOfAttorney
 * Party.mmPowerOfAttorney}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmLocation
 * Party.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
 * Party.mmCloseLinkSecurity}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCloseLink
 * Security.mmCloseLink}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
 * ContactPoint.mmRelatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
 * PartyIdentificationInformation.mmIdentifiedParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
 * Location.mmDomiciledParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmParty
 * Location.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
 * Location.mmTaxableParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
 * Tax.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
 * PowerOfAttorney.mmAuthorisedParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#mmPartyOrGroup
 * PartyAndAuthorisation1.mmPartyOrGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#mmPartyOrGroup
 * PartyAndAuthorisation3.mmPartyOrGroup}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person Person}</li>
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
 * "Party"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
public class Party extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.ContactPoint> contactPoint;
	/**
	 * Number, physical or virtual address, used for communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
	 * ContactPoint.mmRelatedParty}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmContactDetails
	 * PartyIdentification43.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmContactDetails
	 * PartyIdentification40.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmContactDetails
	 * PartyIdentification42.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#mmPreferredMethod
	 * ContactDetails3.mmPreferredMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmContactDetails
	 * PartyIdentification58.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountTax1#mmNonResidenceCountry
	 * AccountTax1.mmNonResidenceCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmContactDetails
	 * PartyIdentification77.mmContactDetails}</li>
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
	public static final MMBusinessAssociationEnd mmContactPoint = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PartyIdentification43.mmContactDetails, PartyIdentification40.mmContactDetails, PartyIdentification42.mmContactDetails, ContactDetails3.mmPreferredMethod,
					PartyIdentification58.mmContactDetails, AccountTax1.mmNonResidenceCountry, PartyIdentification77.mmContactDetails);
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Number, physical or virtual address, used for communication.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PartyIdentificationInformation> identification;
	/**
	 * Specific identification assigned to a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
	 * PartyIdentificationInformation.mmIdentifiedParty}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#mmOwner
	 * CashAccount25.mmOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2#mmParty
	 * PartyAndSignature2.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmRepresentativeOfficer
	 * Organisation12.mmRepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmTreasuryManager
	 * Organisation12.mmTreasuryManager}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmMainMandateHolder
	 * Organisation12.mmMainMandateHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmLegalRepresentative
	 * Organisation12.mmLegalRepresentative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmRepresentativeOfficer
	 * OrganisationModification1.mmRepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmTreasuryManager
	 * OrganisationModification1.mmTreasuryManager}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmMainMandateHolder
	 * OrganisationModification1.mmMainMandateHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmLegalRepresentative
	 * OrganisationModification1.mmLegalRepresentative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndCertificate2#mmParty
	 * PartyAndCertificate2.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndCertificate3#mmParty
	 * PartyAndCertificate3.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#mmInitiatingParty
	 * TransactionParties3.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#mmDebtor
	 * TransactionParties3.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#mmUltimateDebtor
	 * TransactionParties3.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#mmCreditor
	 * TransactionParties3.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#mmUltimateCreditor
	 * TransactionParties3.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#mmTradingParty
	 * TransactionParties3.mmTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#mmInitiatingParty
	 * GroupHeader48.mmInitiatingParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmChequeFrom
	 * Cheque7.mmChequeFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#mmInitiatingParty
	 * GroupHeader55.mmInitiatingParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3#mmAssigner
	 * CaseAssignment3.mmAssigner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3#mmAssignee
	 * CaseAssignment3.mmAssignee}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Case3#mmCreator
	 * Case3.mmCreator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmThirdReimbursementAgent
	 * SettlementInstruction4.mmThirdReimbursementAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#mmInitiatingParty
	 * GroupHeader56.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason7#mmOriginator
	 * PaymentReversalReason7.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#mmInitiatingParty
	 * GroupHeader52.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#mmOriginator
	 * StatusReasonInformation9.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#mmInitiatingParty
	 * GroupHeader47.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendmentReason1#mmOriginator
	 * MandateAmendmentReason1.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason1#mmOriginator
	 * PaymentCancellationReason1.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmInitiatingParty
	 * GroupHeader46.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#mmInitiatingParty
	 * GroupHeader45.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation2#mmParty
	 * IdentificationInformation2.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmAccountOwner
	 * ReportingRequest3.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#mmOriginator
	 * CancellationStatusReason2.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmUltimateDebtor
	 * DirectDebitTransactionInformation15.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmDebtor
	 * DirectDebitTransactionInformation15.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#mmInitiatingParty
	 * GroupHeader62.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmGarnishmentAdministrator
	 * Garnishment1.mmGarnishmentAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmCreditorSchemeIdentification
	 * TransactionReferences4.mmCreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmUltimateDebtor
	 * TaxInformation4.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeParty2#mmPartyIdentification
	 * TradeParty2.mmPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmUltimateDebtor
	 * CreditTransferTransaction23.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmDebtor
	 * CreditTransferTransaction23.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmDebtorAgent
	 * CreditTransferTransaction23.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmCreditor
	 * CreditTransferTransaction23.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmUltimateCreditor
	 * CreditTransferTransaction23.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmAccountOwner
	 * AccountNotification13.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmAccountServicer
	 * AccountNotification13.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmDebtor
	 * AccountNotification13.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmUltimateDebtor
	 * CreditTransferTransaction25.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInitiatingParty
	 * CreditTransferTransaction25.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmDebtor
	 * CreditTransferTransaction25.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmDebtorAgent
	 * CreditTransferTransaction25.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmCreditor
	 * CreditTransferTransaction25.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmUltimateCreditor
	 * CreditTransferTransaction25.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmAccountOwner
	 * OriginalNotificationReference8.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmDebtor
	 * OriginalNotificationReference8.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmUltimateDebtor
	 * CreditTransferTransaction24.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmInitiatingParty
	 * CreditTransferTransaction24.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmDebtor
	 * CreditTransferTransaction24.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmDebtorAgent
	 * CreditTransferTransaction24.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmCreditor
	 * CreditTransferTransaction24.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmUltimateCreditor
	 * CreditTransferTransaction24.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmUltimateDebtor
	 * CreditTransferTransaction26.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmCreditor
	 * CreditTransferTransaction26.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmUltimateCreditor
	 * CreditTransferTransaction26.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmInvoicer
	 * StructuredRemittanceInformation13.mmInvoicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmAccountOwner
	 * OriginalItemReference4.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmDebtor
	 * OriginalItemReference4.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmUltimateDebtor
	 * CreditTransferTransaction22.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmCreditor
	 * CreditTransferTransaction22.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmUltimateCreditor
	 * CreditTransferTransaction22.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmAccountOwner
	 * OriginalNotificationReference7.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmDebtor
	 * OriginalNotificationReference7.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmAccountOwner
	 * NotificationItem6.mmAccountOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#mmDebtor
	 * NotificationItem6.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmCreditor
	 * PaymentInstruction21.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmCreditorAgent
	 * PaymentInstruction21.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmUltimateCreditor
	 * PaymentInstruction21.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmCreditorSchemeIdentification
	 * PaymentInstruction21.mmCreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmCreditor
	 * DirectDebitTransactionInformation21.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmUltimateCreditor
	 * DirectDebitTransactionInformation21.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInitiatingParty
	 * DirectDebitTransactionInformation21.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmDebtor
	 * DirectDebitTransactionInformation21.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmUltimateDebtor
	 * DirectDebitTransactionInformation21.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason3#mmOriginator
	 * PaymentCancellationReason3.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmCreditorSchemeIdentification
	 * Mandate10.mmCreditorSchemeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmCreditor
	 * Mandate10.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmUltimateCreditor
	 * Mandate10.mmUltimateCreditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmDebtor
	 * Mandate10.mmDebtor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmUltimateDebtor
	 * Mandate10.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmDebtor
	 * RequestedModification6.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmCreditor
	 * RequestedModification6.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmDebtor
	 * PaymentInstruction23.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmUltimateDebtor
	 * PaymentInstruction23.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmDebtor
	 * PaymentInstruction22.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmUltimateDebtor
	 * PaymentInstruction22.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmCreditorSchemeIdentification
	 * Mandate9.mmCreditorSchemeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmCreditor
	 * Mandate9.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmUltimateCreditor
	 * Mandate9.mmUltimateCreditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmDebtor
	 * Mandate9.mmDebtor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmUltimateDebtor
	 * Mandate9.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmCreditorSchemeIdentification
	 * OriginalTransactionReference24.mmCreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmUltimateDebtor
	 * OriginalTransactionReference24.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmDebtor
	 * OriginalTransactionReference24.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmDebtorAgent
	 * OriginalTransactionReference24.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmCreditorAgent
	 * OriginalTransactionReference24.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmCreditor
	 * OriginalTransactionReference24.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmUltimateCreditor
	 * OriginalTransactionReference24.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmDebtor
	 * OriginalPaymentInformation7.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmCreditor
	 * OriginalPaymentInformation7.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmUltimateDebtor
	 * OriginalTransactionReference26.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmDebtor
	 * OriginalTransactionReference26.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmCreditorAgent
	 * OriginalTransactionReference26.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmCreditor
	 * OriginalTransactionReference26.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmUltimateCreditor
	 * OriginalTransactionReference26.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmCreditorSchemeIdentification
	 * Mandate11.mmCreditorSchemeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmCreditor
	 * Mandate11.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmUltimateCreditor
	 * Mandate11.mmUltimateCreditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmDebtor
	 * Mandate11.mmDebtor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmUltimateDebtor
	 * Mandate11.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmUltimateCreditor
	 * DirectDebitTransactionInformation22.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmDebtor
	 * DirectDebitTransactionInformation22.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmUltimateDebtor
	 * DirectDebitTransactionInformation22.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#mmCreditorSchemeIdentification
	 * DirectDebitTransaction9.mmCreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmCreditorSchemeIdentification
	 * Mandate8.mmCreditorSchemeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmCreditor
	 * Mandate8.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmUltimateCreditor
	 * Mandate8.mmUltimateCreditor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmDebtor
	 * Mandate8.mmDebtor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmUltimateDebtor
	 * Mandate8.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorSchemeIdentification
	 * AmendmentInformationDetails11.mmOriginalCreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtor
	 * AmendmentInformationDetails11.mmOriginalDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmAssigner
	 * PaymentTransaction79.mmAssigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmAssignee
	 * PaymentTransaction79.mmAssignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmUltimateDebtor
	 * PaymentComplementaryInformation6.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmDebtor
	 * PaymentComplementaryInformation6.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmCreditorAgent
	 * PaymentComplementaryInformation6.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmCreditor
	 * PaymentComplementaryInformation6.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmUltimateCreditor
	 * PaymentComplementaryInformation6.mmUltimateCreditor}</li>
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
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount25.mmOwner, PartyAndSignature2.mmParty, Organisation12.mmRepresentativeOfficer, Organisation12.mmTreasuryManager, Organisation12.mmMainMandateHolder,
					Organisation12.mmLegalRepresentative, OrganisationModification1.mmRepresentativeOfficer, OrganisationModification1.mmTreasuryManager, OrganisationModification1.mmMainMandateHolder,
					OrganisationModification1.mmLegalRepresentative, PartyAndCertificate2.mmParty, PartyAndCertificate3.mmParty, TransactionParties3.mmInitiatingParty, TransactionParties3.mmDebtor, TransactionParties3.mmUltimateDebtor,
					TransactionParties3.mmCreditor, TransactionParties3.mmUltimateCreditor, TransactionParties3.mmTradingParty, GroupHeader48.mmInitiatingParty, Cheque7.mmChequeFrom, GroupHeader55.mmInitiatingParty,
					CaseAssignment3.mmAssigner, CaseAssignment3.mmAssignee, Case3.mmCreator, SettlementInstruction4.mmThirdReimbursementAgent, GroupHeader56.mmInitiatingParty, PaymentReversalReason7.mmOriginator,
					GroupHeader52.mmInitiatingParty, StatusReasonInformation9.mmOriginator, GroupHeader47.mmInitiatingParty, MandateAmendmentReason1.mmOriginator, PaymentCancellationReason1.mmOriginator, GroupHeader46.mmInitiatingParty,
					GroupHeader45.mmInitiatingParty, IdentificationInformation2.mmParty, ReportingRequest3.mmAccountOwner, CancellationStatusReason2.mmOriginator, DirectDebitTransactionInformation15.mmUltimateDebtor,
					DirectDebitTransactionInformation15.mmDebtor, GroupHeader62.mmInitiatingParty, Garnishment1.mmGarnishmentAdministrator, TransactionReferences4.mmCreditorSchemeIdentification, TaxInformation4.mmUltimateDebtor,
					TradeParty2.mmPartyIdentification, CreditTransferTransaction23.mmUltimateDebtor, CreditTransferTransaction23.mmDebtor, CreditTransferTransaction23.mmDebtorAgent, CreditTransferTransaction23.mmCreditor,
					CreditTransferTransaction23.mmUltimateCreditor, AccountNotification13.mmAccountOwner, AccountNotification13.mmAccountServicer, AccountNotification13.mmDebtor, CreditTransferTransaction25.mmUltimateDebtor,
					CreditTransferTransaction25.mmInitiatingParty, CreditTransferTransaction25.mmDebtor, CreditTransferTransaction25.mmDebtorAgent, CreditTransferTransaction25.mmCreditor, CreditTransferTransaction25.mmUltimateCreditor,
					OriginalNotificationReference8.mmAccountOwner, OriginalNotificationReference8.mmDebtor, CreditTransferTransaction24.mmUltimateDebtor, CreditTransferTransaction24.mmInitiatingParty, CreditTransferTransaction24.mmDebtor,
					CreditTransferTransaction24.mmDebtorAgent, CreditTransferTransaction24.mmCreditor, CreditTransferTransaction24.mmUltimateCreditor, CreditTransferTransaction26.mmUltimateDebtor, CreditTransferTransaction26.mmCreditor,
					CreditTransferTransaction26.mmUltimateCreditor, StructuredRemittanceInformation13.mmInvoicer, OriginalItemReference4.mmAccountOwner, OriginalItemReference4.mmDebtor, CreditTransferTransaction22.mmUltimateDebtor,
					CreditTransferTransaction22.mmCreditor, CreditTransferTransaction22.mmUltimateCreditor, OriginalNotificationReference7.mmAccountOwner, OriginalNotificationReference7.mmDebtor, NotificationItem6.mmAccountOwner,
					NotificationItem6.mmDebtor, PaymentInstruction21.mmCreditor, PaymentInstruction21.mmCreditorAgent, PaymentInstruction21.mmUltimateCreditor, PaymentInstruction21.mmCreditorSchemeIdentification,
					DirectDebitTransactionInformation21.mmCreditor, DirectDebitTransactionInformation21.mmUltimateCreditor, DirectDebitTransactionInformation21.mmInitiatingParty, DirectDebitTransactionInformation21.mmDebtor,
					DirectDebitTransactionInformation21.mmUltimateDebtor, PaymentCancellationReason3.mmOriginator, Mandate10.mmCreditorSchemeIdentification, Mandate10.mmCreditor, Mandate10.mmUltimateCreditor, Mandate10.mmDebtor,
					Mandate10.mmUltimateDebtor, RequestedModification6.mmDebtor, RequestedModification6.mmCreditor, PaymentInstruction23.mmDebtor, PaymentInstruction23.mmUltimateDebtor, PaymentInstruction22.mmDebtor,
					PaymentInstruction22.mmUltimateDebtor, Mandate9.mmCreditorSchemeIdentification, Mandate9.mmCreditor, Mandate9.mmUltimateCreditor, Mandate9.mmDebtor, Mandate9.mmUltimateDebtor,
					OriginalTransactionReference24.mmCreditorSchemeIdentification, OriginalTransactionReference24.mmUltimateDebtor, OriginalTransactionReference24.mmDebtor, OriginalTransactionReference24.mmDebtorAgent,
					OriginalTransactionReference24.mmCreditorAgent, OriginalTransactionReference24.mmCreditor, OriginalTransactionReference24.mmUltimateCreditor, OriginalPaymentInformation7.mmDebtor, OriginalPaymentInformation7.mmCreditor,
					OriginalTransactionReference26.mmUltimateDebtor, OriginalTransactionReference26.mmDebtor, OriginalTransactionReference26.mmCreditorAgent, OriginalTransactionReference26.mmCreditor,
					OriginalTransactionReference26.mmUltimateCreditor, Mandate11.mmCreditorSchemeIdentification, Mandate11.mmCreditor, Mandate11.mmUltimateCreditor, Mandate11.mmDebtor, Mandate11.mmUltimateDebtor,
					DirectDebitTransactionInformation22.mmUltimateCreditor, DirectDebitTransactionInformation22.mmDebtor, DirectDebitTransactionInformation22.mmUltimateDebtor, DirectDebitTransaction9.mmCreditorSchemeIdentification,
					Mandate8.mmCreditorSchemeIdentification, Mandate8.mmCreditor, Mandate8.mmUltimateCreditor, Mandate8.mmDebtor, Mandate8.mmUltimateDebtor, AmendmentInformationDetails11.mmOriginalCreditorSchemeIdentification,
					AmendmentInformationDetails11.mmOriginalDebtor, PaymentTransaction79.mmAssigner, PaymentTransaction79.mmAssignee, PaymentComplementaryInformation6.mmUltimateDebtor, PaymentComplementaryInformation6.mmDebtor,
					PaymentComplementaryInformation6.mmCreditorAgent, PaymentComplementaryInformation6.mmCreditor, PaymentComplementaryInformation6.mmUltimateCreditor);
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specific identification assigned to a party.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
		}
	};
	protected MoneyLaunderingCheckCode moneyLaunderingCheck;
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
	public static final MMBusinessAttribute mmMoneyLaunderingCheck = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyLaunderingCheckCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Party.class.getMethod("getMoneyLaunderingCheck", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Tax taxationConditions;
	/**
	 * Taxation parameters which apply to an individual person or to an
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
	 * Tax.mmTaxableParty}</li>
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
	public static final MMBusinessAssociationEnd mmTaxationConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Taxation parameters which apply to an individual person or to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Location domicile;
	/**
	 * Location in which a person is permanently domiciled (the place of a
	 * person's permanent home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
	 * Location.mmDomiciledParty}</li>
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
	public static final MMBusinessAssociationEnd mmDomicile = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Domicile";
			definition = "Location in which a person is permanently domiciled (the place of a person's permanent home).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDomiciledParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Location> residence;
	/**
	 * Location from which the affairs of a company are directed or location in
	 * which a person resides (the place of a person's home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmParty
	 * Location.mmParty}</li>
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
	public static final MMBusinessAssociationEnd mmResidence = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Residence";
			definition = "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected PowerOfAttorney powerOfAttorney;
	/**
	 * Power of attorney which is held by the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
	 * PowerOfAttorney.mmAuthorisedParty}</li>
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
	public static final MMBusinessAssociationEnd mmPowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney which is held by the party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}
	};
	protected Location location;
	/**
	 * Location of the taxable party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
	 * Location.mmTaxableParty}</li>
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
	public static final MMBusinessAssociationEnd mmLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location of the taxable party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Security closeLinkSecurity;
	/**
	 * Security for which a close link with a party is identified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCloseLink
	 * Security.mmCloseLink}</li>
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
	public static final MMBusinessAssociationEnd mmCloseLinkSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CloseLinkSecurity";
			definition = "Security for which a close link with a party is identified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmCloseLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Party";
				definition = "Entity involved in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmCloseLink, com.tools20022.repository.entity.ContactPoint.mmRelatedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty, com.tools20022.repository.entity.Location.mmDomiciledParty, com.tools20022.repository.entity.Location.mmParty,
						com.tools20022.repository.entity.Location.mmTaxableParty, com.tools20022.repository.entity.Tax.mmTaxableParty, com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty);
				derivationElement_lazy = () -> Arrays.asList(PartyAndAuthorisation1.mmPartyOrGroup, PartyAndAuthorisation3.mmPartyOrGroup);
				subType_lazy = () -> Arrays.asList(Organisation.mmObject(), Person.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.mmContactPoint, com.tools20022.repository.entity.Party.mmIdentification, com.tools20022.repository.entity.Party.mmMoneyLaunderingCheck,
						com.tools20022.repository.entity.Party.mmTaxationConditions, com.tools20022.repository.entity.Party.mmDomicile, com.tools20022.repository.entity.Party.mmResidence,
						com.tools20022.repository.entity.Party.mmPowerOfAttorney, com.tools20022.repository.entity.Party.mmLocation, com.tools20022.repository.entity.Party.mmCloseLinkSecurity);
				derivationComponent_lazy = () -> Arrays.asList(PartyAndAuthorisation1.mmObject(), PartyAndAuthorisation3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Party.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<ContactPoint> getContactPoint() {
		return contactPoint;
	}

	public void setContactPoint(List<com.tools20022.repository.entity.ContactPoint> contactPoint) {
		this.contactPoint = contactPoint;
	}

	public List<PartyIdentificationInformation> getIdentification() {
		return identification;
	}

	public void setIdentification(List<com.tools20022.repository.entity.PartyIdentificationInformation> identification) {
		this.identification = identification;
	}

	public MoneyLaunderingCheckCode getMoneyLaunderingCheck() {
		return moneyLaunderingCheck;
	}

	public void setMoneyLaunderingCheck(MoneyLaunderingCheckCode moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
	}

	public Tax getTaxationConditions() {
		return taxationConditions;
	}

	public void setTaxationConditions(com.tools20022.repository.entity.Tax taxationConditions) {
		this.taxationConditions = taxationConditions;
	}

	public Location getDomicile() {
		return domicile;
	}

	public void setDomicile(com.tools20022.repository.entity.Location domicile) {
		this.domicile = domicile;
	}

	public List<Location> getResidence() {
		return residence;
	}

	public void setResidence(List<com.tools20022.repository.entity.Location> residence) {
		this.residence = residence;
	}

	public PowerOfAttorney getPowerOfAttorney() {
		return powerOfAttorney;
	}

	public void setPowerOfAttorney(com.tools20022.repository.entity.PowerOfAttorney powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(com.tools20022.repository.entity.Location location) {
		this.location = location;
	}

	public Security getCloseLinkSecurity() {
		return closeLinkSecurity;
	}

	public void setCloseLinkSecurity(com.tools20022.repository.entity.Security closeLinkSecurity) {
		this.closeLinkSecurity = closeLinkSecurity;
	}
}