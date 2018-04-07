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
import com.tools20022.repository.codeset.CreditQualityCode;
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
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
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCreditQuality
 * Party.mmCreditQuality}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person Person}</li>
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
	protected List<com.tools20022.repository.entity.ContactPoint> contactPoint;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification125#mmContactDetails
	 * PartyIdentification125.mmContactDetails}</li>
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
	public static final MMBusinessAssociationEnd<Party, List<ContactPoint>> mmContactPoint = new MMBusinessAssociationEnd<Party, List<ContactPoint>>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyIdentification43.mmContactDetails, PartyIdentification40.mmContactDetails, PartyIdentification42.mmContactDetails, ContactDetails3.mmPreferredMethod,
					PartyIdentification58.mmContactDetails, AccountTax1.mmNonResidenceCountry, PartyIdentification77.mmContactDetails, PartyIdentification125.mmContactDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Number, physical or virtual address, used for communication.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(Party obj) {
			return obj.getContactPoint();
		}

		@Override
		public void setValue(Party obj, List<ContactPoint> value) {
			obj.setContactPoint(value);
		}
	};
	protected List<PartyIdentificationInformation> identification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmAccountOwner
	 * AccountNotification13.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmAccountServicer
	 * AccountNotification13.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmDebtor
	 * AccountNotification13.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmAccountOwner
	 * OriginalNotificationReference8.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmDebtor
	 * OriginalNotificationReference8.mmDebtor}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Organisation20#mmMainMandateHolder
	 * Organisation20.mmMainMandateHolder}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation20#mmSender
	 * Organisation20.mmSender}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmDebtor
	 * PaymentInstruction24.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmUltimateDebtor
	 * PaymentInstruction24.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmUltimateDebtor
	 * CreditTransferTransaction27.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmCreditor
	 * CreditTransferTransaction27.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmUltimateCreditor
	 * CreditTransferTransaction27.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmUltimateDebtor
	 * PaymentComplementaryInformation7.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmDebtor
	 * PaymentComplementaryInformation7.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmCreditorAgent
	 * PaymentComplementaryInformation7.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmCreditor
	 * PaymentComplementaryInformation7.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmUltimateCreditor
	 * PaymentComplementaryInformation7.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmUltimateDebtor
	 * CreditTransferTransaction31.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmDebtor
	 * CreditTransferTransaction31.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmDebtorAgent
	 * CreditTransferTransaction31.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmCreditor
	 * CreditTransferTransaction31.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmUltimateCreditor
	 * CreditTransferTransaction31.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmDebtor
	 * RequestedModification7.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmCreditor
	 * RequestedModification7.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmAccountOwner
	 * ReportingRequest4.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmAssigner
	 * PaymentTransaction90.mmAssigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmAssignee
	 * PaymentTransaction90.mmAssignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties4#mmInitiatingParty
	 * TransactionParties4.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties4#mmDebtor
	 * TransactionParties4.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties4#mmUltimateDebtor
	 * TransactionParties4.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties4#mmCreditor
	 * TransactionParties4.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties4#mmUltimateCreditor
	 * TransactionParties4.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties4#mmTradingParty
	 * TransactionParties4.mmTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmAssigner
	 * PaymentTransaction85.mmAssigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmAssignee
	 * PaymentTransaction85.mmAssignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmCreditorSchemeIdentification
	 * OriginalTransactionReference27.mmCreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmUltimateDebtor
	 * OriginalTransactionReference27.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmDebtor
	 * OriginalTransactionReference27.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmDebtorAgent
	 * OriginalTransactionReference27.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmCreditorAgent
	 * OriginalTransactionReference27.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmCreditor
	 * OriginalTransactionReference27.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmUltimateCreditor
	 * OriginalTransactionReference27.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason3#mmOriginator
	 * CancellationStatusReason3.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationStatusReason1#mmOriginator
	 * ModificationStatusReason1.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmUltimateDebtor
	 * TransactionParties5.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmDebtor
	 * TransactionParties5.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmInitiatingParty
	 * TransactionParties5.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmDebtorAgent
	 * TransactionParties5.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmCreditor
	 * TransactionParties5.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmUltimateCreditor
	 * TransactionParties5.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmUltimateDebtor
	 * CreditTransferTransaction32.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmInitiatingParty
	 * CreditTransferTransaction32.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmDebtor
	 * CreditTransferTransaction32.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmDebtorAgent
	 * CreditTransferTransaction32.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmCreditor
	 * CreditTransferTransaction32.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmUltimateCreditor
	 * CreditTransferTransaction32.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmUltimateDebtor
	 * CreditTransferTransaction30.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmInitiatingParty
	 * CreditTransferTransaction30.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmDebtor
	 * CreditTransferTransaction30.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmDebtorAgent
	 * CreditTransferTransaction30.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmCreditor
	 * CreditTransferTransaction30.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmUltimateCreditor
	 * CreditTransferTransaction30.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation14#mmInvoicer
	 * StructuredRemittanceInformation14.mmInvoicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount36#mmOwner
	 * CashAccount36.mmOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Case4#mmCreator
	 * Case4.mmCreator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment4#mmAssigner
	 * CaseAssignment4.mmAssigner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment4#mmAssignee
	 * CaseAssignment4.mmAssignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader74#mmInitiatingParty
	 * GroupHeader74.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason4#mmOriginator
	 * PaymentCancellationReason4.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader75#mmInitiatingParty
	 * GroupHeader75.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmInvoicer
	 * StructuredRemittanceInformation15.mmInvoicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation7#mmUltimateDebtor
	 * TaxInformation7.mmUltimateDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment2#mmGarnishmentAdministrator
	 * Garnishment2.mmGarnishmentAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation11#mmOriginator
	 * StatusReasonInformation11.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason8#mmOriginator
	 * PaymentReversalReason8.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalCreditorSchemeIdentification
	 * AmendmentInformationDetails12.mmOriginalCreditorSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalDebtor
	 * AmendmentInformationDetails12.mmOriginalDebtor}</li>
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
	public static final MMBusinessAssociationEnd<Party, List<PartyIdentificationInformation>> mmIdentification = new MMBusinessAssociationEnd<Party, List<PartyIdentificationInformation>>() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount25.mmOwner, PartyAndSignature2.mmParty, Organisation12.mmRepresentativeOfficer, Organisation12.mmTreasuryManager, Organisation12.mmMainMandateHolder,
					Organisation12.mmLegalRepresentative, OrganisationModification1.mmRepresentativeOfficer, OrganisationModification1.mmTreasuryManager, OrganisationModification1.mmMainMandateHolder,
					OrganisationModification1.mmLegalRepresentative, PartyAndCertificate2.mmParty, PartyAndCertificate3.mmParty, GroupHeader48.mmInitiatingParty, Cheque7.mmChequeFrom, GroupHeader55.mmInitiatingParty,
					CaseAssignment3.mmAssigner, CaseAssignment3.mmAssignee, Case3.mmCreator, SettlementInstruction4.mmThirdReimbursementAgent, StatusReasonInformation9.mmOriginator, GroupHeader47.mmInitiatingParty,
					MandateAmendmentReason1.mmOriginator, PaymentCancellationReason1.mmOriginator, GroupHeader46.mmInitiatingParty, GroupHeader45.mmInitiatingParty, IdentificationInformation2.mmParty,
					DirectDebitTransactionInformation15.mmUltimateDebtor, DirectDebitTransactionInformation15.mmDebtor, GroupHeader62.mmInitiatingParty, Garnishment1.mmGarnishmentAdministrator,
					TransactionReferences4.mmCreditorSchemeIdentification, TaxInformation4.mmUltimateDebtor, TradeParty2.mmPartyIdentification, AccountNotification13.mmAccountOwner, AccountNotification13.mmAccountServicer,
					AccountNotification13.mmDebtor, OriginalNotificationReference8.mmAccountOwner, OriginalNotificationReference8.mmDebtor, CreditTransferTransaction26.mmUltimateDebtor, CreditTransferTransaction26.mmCreditor,
					CreditTransferTransaction26.mmUltimateCreditor, StructuredRemittanceInformation13.mmInvoicer, OriginalItemReference4.mmAccountOwner, OriginalItemReference4.mmDebtor, CreditTransferTransaction22.mmUltimateDebtor,
					CreditTransferTransaction22.mmCreditor, CreditTransferTransaction22.mmUltimateCreditor, OriginalNotificationReference7.mmAccountOwner, OriginalNotificationReference7.mmDebtor, NotificationItem6.mmAccountOwner,
					NotificationItem6.mmDebtor, Organisation20.mmMainMandateHolder, Organisation20.mmSender, PaymentInstruction21.mmCreditor, PaymentInstruction21.mmCreditorAgent, PaymentInstruction21.mmUltimateCreditor,
					PaymentInstruction21.mmCreditorSchemeIdentification, DirectDebitTransactionInformation21.mmCreditor, DirectDebitTransactionInformation21.mmUltimateCreditor, DirectDebitTransactionInformation21.mmInitiatingParty,
					DirectDebitTransactionInformation21.mmDebtor, DirectDebitTransactionInformation21.mmUltimateDebtor, Mandate10.mmCreditorSchemeIdentification, Mandate10.mmCreditor, Mandate10.mmUltimateCreditor, Mandate10.mmDebtor,
					Mandate10.mmUltimateDebtor, PaymentInstruction23.mmDebtor, PaymentInstruction23.mmUltimateDebtor, PaymentInstruction22.mmDebtor, PaymentInstruction22.mmUltimateDebtor, Mandate9.mmCreditorSchemeIdentification,
					Mandate9.mmCreditor, Mandate9.mmUltimateCreditor, Mandate9.mmDebtor, Mandate9.mmUltimateDebtor, OriginalPaymentInformation7.mmDebtor, OriginalPaymentInformation7.mmCreditor,
					OriginalTransactionReference26.mmUltimateDebtor, OriginalTransactionReference26.mmDebtor, OriginalTransactionReference26.mmCreditorAgent, OriginalTransactionReference26.mmCreditor,
					OriginalTransactionReference26.mmUltimateCreditor, Mandate11.mmCreditorSchemeIdentification, Mandate11.mmCreditor, Mandate11.mmUltimateCreditor, Mandate11.mmDebtor, Mandate11.mmUltimateDebtor,
					DirectDebitTransactionInformation22.mmUltimateCreditor, DirectDebitTransactionInformation22.mmDebtor, DirectDebitTransactionInformation22.mmUltimateDebtor, DirectDebitTransaction9.mmCreditorSchemeIdentification,
					Mandate8.mmCreditorSchemeIdentification, Mandate8.mmCreditor, Mandate8.mmUltimateCreditor, Mandate8.mmDebtor, Mandate8.mmUltimateDebtor, AmendmentInformationDetails11.mmOriginalCreditorSchemeIdentification,
					AmendmentInformationDetails11.mmOriginalDebtor, PaymentInstruction24.mmDebtor, PaymentInstruction24.mmUltimateDebtor, CreditTransferTransaction27.mmUltimateDebtor, CreditTransferTransaction27.mmCreditor,
					CreditTransferTransaction27.mmUltimateCreditor, PaymentComplementaryInformation7.mmUltimateDebtor, PaymentComplementaryInformation7.mmDebtor, PaymentComplementaryInformation7.mmCreditorAgent,
					PaymentComplementaryInformation7.mmCreditor, PaymentComplementaryInformation7.mmUltimateCreditor, CreditTransferTransaction31.mmUltimateDebtor, CreditTransferTransaction31.mmDebtor,
					CreditTransferTransaction31.mmDebtorAgent, CreditTransferTransaction31.mmCreditor, CreditTransferTransaction31.mmUltimateCreditor, RequestedModification7.mmDebtor, RequestedModification7.mmCreditor,
					ReportingRequest4.mmAccountOwner, PaymentTransaction90.mmAssigner, PaymentTransaction90.mmAssignee, TransactionParties4.mmInitiatingParty, TransactionParties4.mmDebtor, TransactionParties4.mmUltimateDebtor,
					TransactionParties4.mmCreditor, TransactionParties4.mmUltimateCreditor, TransactionParties4.mmTradingParty, PaymentTransaction85.mmAssigner, PaymentTransaction85.mmAssignee,
					OriginalTransactionReference27.mmCreditorSchemeIdentification, OriginalTransactionReference27.mmUltimateDebtor, OriginalTransactionReference27.mmDebtor, OriginalTransactionReference27.mmDebtorAgent,
					OriginalTransactionReference27.mmCreditorAgent, OriginalTransactionReference27.mmCreditor, OriginalTransactionReference27.mmUltimateCreditor, CancellationStatusReason3.mmOriginator,
					ModificationStatusReason1.mmOriginator, TransactionParties5.mmUltimateDebtor, TransactionParties5.mmDebtor, TransactionParties5.mmInitiatingParty, TransactionParties5.mmDebtorAgent, TransactionParties5.mmCreditor,
					TransactionParties5.mmUltimateCreditor, CreditTransferTransaction32.mmUltimateDebtor, CreditTransferTransaction32.mmInitiatingParty, CreditTransferTransaction32.mmDebtor, CreditTransferTransaction32.mmDebtorAgent,
					CreditTransferTransaction32.mmCreditor, CreditTransferTransaction32.mmUltimateCreditor, CreditTransferTransaction30.mmUltimateDebtor, CreditTransferTransaction30.mmInitiatingParty, CreditTransferTransaction30.mmDebtor,
					CreditTransferTransaction30.mmDebtorAgent, CreditTransferTransaction30.mmCreditor, CreditTransferTransaction30.mmUltimateCreditor, StructuredRemittanceInformation14.mmInvoicer, CashAccount36.mmOwner, Case4.mmCreator,
					CaseAssignment4.mmAssigner, CaseAssignment4.mmAssignee, GroupHeader74.mmInitiatingParty, PaymentCancellationReason4.mmOriginator, GroupHeader75.mmInitiatingParty, StructuredRemittanceInformation15.mmInvoicer,
					TaxInformation7.mmUltimateDebtor, Garnishment2.mmGarnishmentAdministrator, StatusReasonInformation11.mmOriginator, PaymentReversalReason8.mmOriginator,
					AmendmentInformationDetails12.mmOriginalCreditorSchemeIdentification, AmendmentInformationDetails12.mmOriginalDebtor);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specific identification assigned to a party.";
			minOccurs = 1;
			opposite_lazy = () -> PartyIdentificationInformation.mmIdentifiedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}

		@Override
		public List<PartyIdentificationInformation> getValue(Party obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Party obj, List<PartyIdentificationInformation> value) {
			obj.setIdentification(value);
		}
	};
	protected MoneyLaunderingCheckCode moneyLaunderingCheck;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Party, MoneyLaunderingCheckCode> mmMoneyLaunderingCheck = new MMBusinessAttribute<Party, MoneyLaunderingCheckCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyLaunderingCheckCode.mmObject();
		}

		@Override
		public MoneyLaunderingCheckCode getValue(Party obj) {
			return obj.getMoneyLaunderingCheck();
		}

		@Override
		public void setValue(Party obj, MoneyLaunderingCheckCode value) {
			obj.setMoneyLaunderingCheck(value);
		}
	};
	protected Tax taxationConditions;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Party, Tax> mmTaxationConditions = new MMBusinessAssociationEnd<Party, Tax>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Taxation parameters which apply to an individual person or to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tax.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Tax getValue(Party obj) {
			return obj.getTaxationConditions();
		}

		@Override
		public void setValue(Party obj, Tax value) {
			obj.setTaxationConditions(value);
		}
	};
	protected Location domicile;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location> mmDomicile = new MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Domicile";
			definition = "Location in which a person is permanently domiciled (the place of a person's permanent home).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDomiciledParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Location getValue(Party obj) {
			return obj.getDomicile();
		}

		@Override
		public void setValue(Party obj, com.tools20022.repository.entity.Location value) {
			obj.setDomicile(value);
		}
	};
	protected List<com.tools20022.repository.entity.Location> residence;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Party, List<Location>> mmResidence = new MMBusinessAssociationEnd<Party, List<Location>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Residence";
			definition = "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public List<Location> getValue(Party obj) {
			return obj.getResidence();
		}

		@Override
		public void setValue(Party obj, List<Location> value) {
			obj.setResidence(value);
		}
	};
	protected PowerOfAttorney powerOfAttorney;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Party, Optional<PowerOfAttorney>> mmPowerOfAttorney = new MMBusinessAssociationEnd<Party, Optional<PowerOfAttorney>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney which is held by the party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}

		@Override
		public Optional<PowerOfAttorney> getValue(Party obj) {
			return obj.getPowerOfAttorney();
		}

		@Override
		public void setValue(Party obj, Optional<PowerOfAttorney> value) {
			obj.setPowerOfAttorney(value.orElse(null));
		}
	};
	protected Location location;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location> mmLocation = new MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location of the taxable party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Location getValue(Party obj) {
			return obj.getLocation();
		}

		@Override
		public void setValue(Party obj, com.tools20022.repository.entity.Location value) {
			obj.setLocation(value);
		}
	};
	protected Security closeLinkSecurity;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Party, Security> mmCloseLinkSecurity = new MMBusinessAssociationEnd<Party, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CloseLinkSecurity";
			definition = "Security for which a close link with a party is identified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmCloseLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(Party obj) {
			return obj.getCloseLinkSecurity();
		}

		@Override
		public void setValue(Party obj, Security value) {
			obj.setCloseLinkSecurity(value);
		}
	};
	protected CreditQualityCode creditQuality;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditQuality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit quality for the clearing member."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Party, CreditQualityCode> mmCreditQuality = new MMBusinessAttribute<Party, CreditQualityCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditQuality";
			definition = "Credit quality for the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditQualityCode.mmObject();
		}

		@Override
		public CreditQualityCode getValue(Party obj) {
			return obj.getCreditQuality();
		}

		@Override
		public void setValue(Party obj, CreditQualityCode value) {
			obj.setCreditQuality(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Party";
				definition = "Entity involved in an activity.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmCloseLink, com.tools20022.repository.entity.ContactPoint.mmRelatedParty, PartyIdentificationInformation.mmIdentifiedParty,
						com.tools20022.repository.entity.Location.mmDomiciledParty, com.tools20022.repository.entity.Location.mmParty, com.tools20022.repository.entity.Location.mmTaxableParty, Tax.mmTaxableParty,
						com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty);
				derivationElement_lazy = () -> Arrays.asList(PartyAndAuthorisation1.mmPartyOrGroup, PartyAndAuthorisation3.mmPartyOrGroup);
				subType_lazy = () -> Arrays.asList(Organisation.mmObject(), Person.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.mmContactPoint, com.tools20022.repository.entity.Party.mmIdentification, com.tools20022.repository.entity.Party.mmMoneyLaunderingCheck,
						com.tools20022.repository.entity.Party.mmTaxationConditions, com.tools20022.repository.entity.Party.mmDomicile, com.tools20022.repository.entity.Party.mmResidence,
						com.tools20022.repository.entity.Party.mmPowerOfAttorney, com.tools20022.repository.entity.Party.mmLocation, com.tools20022.repository.entity.Party.mmCloseLinkSecurity,
						com.tools20022.repository.entity.Party.mmCreditQuality);
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
		return contactPoint == null ? contactPoint = new ArrayList<>() : contactPoint;
	}

	public Party setContactPoint(List<com.tools20022.repository.entity.ContactPoint> contactPoint) {
		this.contactPoint = Objects.requireNonNull(contactPoint);
		return this;
	}

	public List<PartyIdentificationInformation> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public Party setIdentification(List<PartyIdentificationInformation> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public MoneyLaunderingCheckCode getMoneyLaunderingCheck() {
		return moneyLaunderingCheck;
	}

	public Party setMoneyLaunderingCheck(MoneyLaunderingCheckCode moneyLaunderingCheck) {
		this.moneyLaunderingCheck = Objects.requireNonNull(moneyLaunderingCheck);
		return this;
	}

	public Tax getTaxationConditions() {
		return taxationConditions;
	}

	public Party setTaxationConditions(Tax taxationConditions) {
		this.taxationConditions = Objects.requireNonNull(taxationConditions);
		return this;
	}

	public Location getDomicile() {
		return domicile;
	}

	public Party setDomicile(com.tools20022.repository.entity.Location domicile) {
		this.domicile = Objects.requireNonNull(domicile);
		return this;
	}

	public List<Location> getResidence() {
		return residence == null ? residence = new ArrayList<>() : residence;
	}

	public Party setResidence(List<com.tools20022.repository.entity.Location> residence) {
		this.residence = Objects.requireNonNull(residence);
		return this;
	}

	public Optional<PowerOfAttorney> getPowerOfAttorney() {
		return powerOfAttorney == null ? Optional.empty() : Optional.of(powerOfAttorney);
	}

	public Party setPowerOfAttorney(com.tools20022.repository.entity.PowerOfAttorney powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
		return this;
	}

	public Location getLocation() {
		return location;
	}

	public Party setLocation(com.tools20022.repository.entity.Location location) {
		this.location = Objects.requireNonNull(location);
		return this;
	}

	public Security getCloseLinkSecurity() {
		return closeLinkSecurity;
	}

	public Party setCloseLinkSecurity(Security closeLinkSecurity) {
		this.closeLinkSecurity = Objects.requireNonNull(closeLinkSecurity);
		return this;
	}

	public CreditQualityCode getCreditQuality() {
		return creditQuality;
	}

	public Party setCreditQuality(CreditQualityCode creditQuality) {
		this.creditQuality = Objects.requireNonNull(creditQuality);
		return this;
	}
}