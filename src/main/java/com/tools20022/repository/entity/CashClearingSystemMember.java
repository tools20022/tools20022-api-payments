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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.AustralianBSBIdentification;
import com.tools20022.repository.entity.ClearingMemberRole;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ClearingSystemMemberIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Unique and unambiguous identifier for a clearing system member, as assigned
 * by the clearing system. In some clearing systems, the accounts of the
 * clearing system members are also assigned an identifier. The identifier can
 * be used when transmitting, reconciling and confirming payment orders or
 * security transfer instructions prior to settlement, and may include the
 * netting of instructions and the establishment of final positions for
 * settlement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashClearingSystemMember"
 * src="doc-files/CashClearingSystemMember.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmOrganisationIdentification
 * CashClearingSystemMember.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCHIPSUniversalIdentification
 * CashClearingSystemMember.mmCHIPSUniversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmNewZealandNCC
 * CashClearingSystemMember.mmNewZealandNCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmIrishNSC
 * CashClearingSystemMember.mmIrishNSC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmUKSortCode
 * CashClearingSystemMember.mmUKSortCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCHIPSParticipantIdentification
 * CashClearingSystemMember.mmCHIPSParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSwissBC
 * CashClearingSystemMember.mmSwissBC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmFedwireRoutingNumber
 * CashClearingSystemMember.mmFedwireRoutingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmPortugueseNCC
 * CashClearingSystemMember.mmPortugueseNCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmRussianCentralBankIdentificationCode
 * CashClearingSystemMember.mmRussianCentralBankIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmItalianDomesticIdentificationCode
 * CashClearingSystemMember.mmItalianDomesticIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmAustrianBankleitzahl
 * CashClearingSystemMember.mmAustrianBankleitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCanadianPaymentsAssociationRoutingNumber
 * CashClearingSystemMember.mmCanadianPaymentsAssociationRoutingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSwissSIC
 * CashClearingSystemMember.mmSwissSIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmGermanBankleitzahl
 * CashClearingSystemMember.mmGermanBankleitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSpanishDomesticInterbankingCode
 * CashClearingSystemMember.mmSpanishDomesticInterbankingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSouthAfricanNCC
 * CashClearingSystemMember.mmSouthAfricanNCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmHongKongBankCode
 * CashClearingSystemMember.mmHongKongBankCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmClearingMember
 * CashClearingSystemMember.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmIndianFinancialSystemCode
 * CashClearingSystemMember.mmIndianFinancialSystemCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmHellenicBankIdentificationCode
 * CashClearingSystemMember.mmHellenicBankIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmPolishNationalClearingCode
 * CashClearingSystemMember.mmPolishNationalClearingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmAustralianBSBCode
 * CashClearingSystemMember.mmAustralianBSBCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmClearingSystemMemberIdentificationType
 * AustralianBSBIdentification.mmClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSystemMemberIdentification
 * ClearingMemberRole.mmClearingSystemMemberIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2
 * ClearingSystemMemberIdentification2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=BusinessComment, BusinessComment=|Definition given by
 * securities earlier: |Identifies an institution that collects funds from the
 * public to place in financial assets. | Depository institutions pay interest
 * on deposits and invest the deposit money. | Nondepository institutions
 * collect money by selling insurance policies or receiving |employer
 * contributions and pay it out for legitimate claims or for retirement
 * benefits.</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashClearingSystemMember"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement."
 * </li>
 * </ul>
 */
public class CashClearingSystemMember {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OrganisationIdentification organisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
	 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification parameters which include clearing system member identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashClearingSystemMember, OrganisationIdentification> mmOrganisationIdentification = new MMBusinessAssociationEnd<CashClearingSystemMember, OrganisationIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Identification parameters which include clearing system member identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> OrganisationIdentification.mmClearingSystemMemberIdentificationType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> OrganisationIdentification.mmObject();
		}

		@Override
		public OrganisationIdentification getValue(CashClearingSystemMember obj) {
			return obj.getOrganisationIdentification();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, OrganisationIdentification value) {
			obj.setOrganisationIdentification(value);
		}
	};
	protected CHIPSUniversalIdentifier cHIPSUniversalIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSUniversalIdentifier
	 * CHIPSUniversalIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSUniversalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, CHIPSUniversalIdentifier> mmCHIPSUniversalIdentification = new MMBusinessAttribute<CashClearingSystemMember, CHIPSUniversalIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CHIPSUniversalIdentification";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSUniversalIdentifier.mmObject();
		}

		@Override
		public CHIPSUniversalIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getCHIPSUniversalIdentification();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, CHIPSUniversalIdentifier value) {
			obj.setCHIPSUniversalIdentification(value);
		}
	};
	protected NewZealandNCCIdentifier newZealandNCC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NewZealandNCCIdentifier
	 * NewZealandNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealandNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, NewZealandNCCIdentifier> mmNewZealandNCC = new MMBusinessAttribute<CashClearingSystemMember, NewZealandNCCIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewZealandNCC";
			definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NewZealandNCCIdentifier.mmObject();
		}

		@Override
		public NewZealandNCCIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getNewZealandNCC();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, NewZealandNCCIdentifier value) {
			obj.setNewZealandNCC(value);
		}
	};
	protected IrishNSCIdentifier irishNSC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IrishNSCIdentifier
	 * IrishNSCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IrishNSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, IrishNSCIdentifier> mmIrishNSC = new MMBusinessAttribute<CashClearingSystemMember, IrishNSCIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IrishNSC";
			definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IrishNSCIdentifier.mmObject();
		}

		@Override
		public IrishNSCIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getIrishNSC();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, IrishNSCIdentifier value) {
			obj.setIrishNSC(value);
		}
	};
	protected UKDomesticSortCodeIdentifier uKSortCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UKDomesticSortCodeIdentifier
	 * UKDomesticSortCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKSortCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, UKDomesticSortCodeIdentifier> mmUKSortCode = new MMBusinessAttribute<CashClearingSystemMember, UKDomesticSortCodeIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UKSortCode";
			definition = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UKDomesticSortCodeIdentifier.mmObject();
		}

		@Override
		public UKDomesticSortCodeIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getUKSortCode();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, UKDomesticSortCodeIdentifier value) {
			obj.setUKSortCode(value);
		}
	};
	protected CHIPSParticipantIdentifier cHIPSParticipantIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSParticipantIdentifier
	 * CHIPSParticipantIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, CHIPSParticipantIdentifier> mmCHIPSParticipantIdentification = new MMBusinessAttribute<CashClearingSystemMember, CHIPSParticipantIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CHIPSParticipantIdentification";
			definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSParticipantIdentifier.mmObject();
		}

		@Override
		public CHIPSParticipantIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getCHIPSParticipantIdentification();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, CHIPSParticipantIdentifier value) {
			obj.setCHIPSParticipantIdentification(value);
		}
	};
	protected SwissBCIdentifier swissBC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissBCIdentifier
	 * SwissBCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, SwissBCIdentifier> mmSwissBC = new MMBusinessAttribute<CashClearingSystemMember, SwissBCIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwissBC";
			definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissBCIdentifier.mmObject();
		}

		@Override
		public SwissBCIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getSwissBC();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, SwissBCIdentifier value) {
			obj.setSwissBC(value);
		}
	};
	protected FedwireRoutingNumberIdentifier fedwireRoutingNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.FedwireRoutingNumberIdentifier
	 * FedwireRoutingNumberIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedwireRoutingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, FedwireRoutingNumberIdentifier> mmFedwireRoutingNumber = new MMBusinessAttribute<CashClearingSystemMember, FedwireRoutingNumberIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FedwireRoutingNumber";
			definition = "Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FedwireRoutingNumberIdentifier.mmObject();
		}

		@Override
		public FedwireRoutingNumberIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getFedwireRoutingNumber();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, FedwireRoutingNumberIdentifier value) {
			obj.setFedwireRoutingNumber(value);
		}
	};
	protected PortugueseNCCIdentifier portugueseNCC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PortugueseNCCIdentifier
	 * PortugueseNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortugueseNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, PortugueseNCCIdentifier> mmPortugueseNCC = new MMBusinessAttribute<CashClearingSystemMember, PortugueseNCCIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PortugueseNCC";
			definition = "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PortugueseNCCIdentifier.mmObject();
		}

		@Override
		public PortugueseNCCIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getPortugueseNCC();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, PortugueseNCCIdentifier value) {
			obj.setPortugueseNCC(value);
		}
	};
	protected RussianCentralBankIdentificationCodeIdentifier russianCentralBankIdentificationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RussianCentralBankIdentificationCodeIdentifier
	 * RussianCentralBankIdentificationCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RussianCentralBankIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, RussianCentralBankIdentificationCodeIdentifier> mmRussianCentralBankIdentificationCode = new MMBusinessAttribute<CashClearingSystemMember, RussianCentralBankIdentificationCodeIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RussianCentralBankIdentificationCode";
			definition = "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RussianCentralBankIdentificationCodeIdentifier.mmObject();
		}

		@Override
		public RussianCentralBankIdentificationCodeIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getRussianCentralBankIdentificationCode();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, RussianCentralBankIdentificationCodeIdentifier value) {
			obj.setRussianCentralBankIdentificationCode(value);
		}
	};
	protected ItalianDomesticIdentifier italianDomesticIdentificationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ItalianDomesticIdentifier
	 * ItalianDomesticIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItalianDomesticIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, ItalianDomesticIdentifier> mmItalianDomesticIdentificationCode = new MMBusinessAttribute<CashClearingSystemMember, ItalianDomesticIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ItalianDomesticIdentificationCode";
			definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ItalianDomesticIdentifier.mmObject();
		}

		@Override
		public ItalianDomesticIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getItalianDomesticIdentificationCode();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, ItalianDomesticIdentifier value) {
			obj.setItalianDomesticIdentificationCode(value);
		}
	};
	protected AustrianBankleitzahlIdentifier austrianBankleitzahl;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AustrianBankleitzahlIdentifier
	 * AustrianBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustrianBankleitzahl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, AustrianBankleitzahlIdentifier> mmAustrianBankleitzahl = new MMBusinessAttribute<CashClearingSystemMember, AustrianBankleitzahlIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AustrianBankleitzahl";
			definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AustrianBankleitzahlIdentifier.mmObject();
		}

		@Override
		public AustrianBankleitzahlIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getAustrianBankleitzahl();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, AustrianBankleitzahlIdentifier value) {
			obj.setAustrianBankleitzahl(value);
		}
	};
	protected CanadianPaymentsARNIdentifier canadianPaymentsAssociationRoutingNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CanadianPaymentsARNIdentifier
	 * CanadianPaymentsARNIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianPaymentsAssociationRoutingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, CanadianPaymentsARNIdentifier> mmCanadianPaymentsAssociationRoutingNumber = new MMBusinessAttribute<CashClearingSystemMember, CanadianPaymentsARNIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CanadianPaymentsAssociationRoutingNumber";
			definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CanadianPaymentsARNIdentifier.mmObject();
		}

		@Override
		public CanadianPaymentsARNIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getCanadianPaymentsAssociationRoutingNumber();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, CanadianPaymentsARNIdentifier value) {
			obj.setCanadianPaymentsAssociationRoutingNumber(value);
		}
	};
	protected SwissSICIdentifier swissSIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissSICIdentifier
	 * SwissSICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissSIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, SwissSICIdentifier> mmSwissSIC = new MMBusinessAttribute<CashClearingSystemMember, SwissSICIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwissSIC";
			definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissSICIdentifier.mmObject();
		}

		@Override
		public SwissSICIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getSwissSIC();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, SwissSICIdentifier value) {
			obj.setSwissSIC(value);
		}
	};
	protected GermanBankleitzahlIdentifier germanBankleitzahl;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.GermanBankleitzahlIdentifier
	 * GermanBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanBankleitzahl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "German Bankleitzahl - identifies German financial institutions on the German national clearing systems."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, GermanBankleitzahlIdentifier> mmGermanBankleitzahl = new MMBusinessAttribute<CashClearingSystemMember, GermanBankleitzahlIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GermanBankleitzahl";
			definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GermanBankleitzahlIdentifier.mmObject();
		}

		@Override
		public GermanBankleitzahlIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getGermanBankleitzahl();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, GermanBankleitzahlIdentifier value) {
			obj.setGermanBankleitzahl(value);
		}
	};
	protected SpanishDomesticInterbankingIdentifier spanishDomesticInterbankingCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SpanishDomesticInterbankingIdentifier
	 * SpanishDomesticInterbankingIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpanishDomesticInterbankingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, SpanishDomesticInterbankingIdentifier> mmSpanishDomesticInterbankingCode = new MMBusinessAttribute<CashClearingSystemMember, SpanishDomesticInterbankingIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpanishDomesticInterbankingCode";
			definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SpanishDomesticInterbankingIdentifier.mmObject();
		}

		@Override
		public SpanishDomesticInterbankingIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getSpanishDomesticInterbankingCode();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, SpanishDomesticInterbankingIdentifier value) {
			obj.setSpanishDomesticInterbankingCode(value);
		}
	};
	protected SouthAfricanNCCIdentifier southAfricanNCC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SouthAfricanNCCIdentifier
	 * SouthAfricanNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SouthAfricanNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, SouthAfricanNCCIdentifier> mmSouthAfricanNCC = new MMBusinessAttribute<CashClearingSystemMember, SouthAfricanNCCIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SouthAfricanNCC";
			definition = "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SouthAfricanNCCIdentifier.mmObject();
		}

		@Override
		public SouthAfricanNCCIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getSouthAfricanNCC();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, SouthAfricanNCCIdentifier value) {
			obj.setSouthAfricanNCC(value);
		}
	};
	protected HongKongBankIdentifier hongKongBankCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.HongKongBankIdentifier
	 * HongKongBankIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKongBankCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, HongKongBankIdentifier> mmHongKongBankCode = new MMBusinessAttribute<CashClearingSystemMember, HongKongBankIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HongKongBankCode";
			definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HongKongBankIdentifier.mmObject();
		}

		@Override
		public HongKongBankIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getHongKongBankCode();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, HongKongBankIdentifier value) {
			obj.setHongKongBankCode(value);
		}
	};
	protected ClearingMemberRole clearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSystemMemberIdentification
	 * ClearingMemberRole.mmClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing system member for which a clearing system member identification is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashClearingSystemMember, ClearingMemberRole> mmClearingMember = new MMBusinessAssociationEnd<CashClearingSystemMember, ClearingMemberRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingMember";
			definition = "Clearing system member for which a clearing system member identification is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ClearingMemberRole.mmClearingSystemMemberIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public ClearingMemberRole getValue(CashClearingSystemMember obj) {
			return obj.getClearingMember();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, ClearingMemberRole value) {
			obj.setClearingMember(value);
		}
	};
	protected IndianFinancialSystemCodeIdentifier indianFinancialSystemCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IndianFinancialSystemCodeIdentifier
	 * IndianFinancialSystemCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndianFinancialSystemCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, IndianFinancialSystemCodeIdentifier> mmIndianFinancialSystemCode = new MMBusinessAttribute<CashClearingSystemMember, IndianFinancialSystemCodeIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndianFinancialSystemCode";
			definition = "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IndianFinancialSystemCodeIdentifier.mmObject();
		}

		@Override
		public IndianFinancialSystemCodeIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getIndianFinancialSystemCode();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, IndianFinancialSystemCodeIdentifier value) {
			obj.setIndianFinancialSystemCode(value);
		}
	};
	protected HellenicBankIdentificationCodeIdentifier hellenicBankIdentificationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.HellenicBankIdentificationCodeIdentifier
	 * HellenicBankIdentificationCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HellenicBankIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, HellenicBankIdentificationCodeIdentifier> mmHellenicBankIdentificationCode = new MMBusinessAttribute<CashClearingSystemMember, HellenicBankIdentificationCodeIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HellenicBankIdentificationCode";
			definition = "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HellenicBankIdentificationCodeIdentifier.mmObject();
		}

		@Override
		public HellenicBankIdentificationCodeIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getHellenicBankIdentificationCode();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, HellenicBankIdentificationCodeIdentifier value) {
			obj.setHellenicBankIdentificationCode(value);
		}
	};
	protected PolishNationalClearingCodeIdentifier polishNationalClearingCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PolishNationalClearingCodeIdentifier
	 * PolishNationalClearingCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PolishNationalClearingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashClearingSystemMember, PolishNationalClearingCodeIdentifier> mmPolishNationalClearingCode = new MMBusinessAttribute<CashClearingSystemMember, PolishNationalClearingCodeIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PolishNationalClearingCode";
			definition = "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PolishNationalClearingCodeIdentifier.mmObject();
		}

		@Override
		public PolishNationalClearingCodeIdentifier getValue(CashClearingSystemMember obj) {
			return obj.getPolishNationalClearingCode();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, PolishNationalClearingCodeIdentifier value) {
			obj.setPolishNationalClearingCode(value);
		}
	};
	protected AustralianBSBIdentification australianBSBCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmClearingSystemMemberIdentificationType
	 * AustralianBSBIdentification.mmClearingSystemMemberIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification
	 * AustralianBSBIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianBSBCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashClearingSystemMember, AustralianBSBIdentification> mmAustralianBSBCode = new MMBusinessAssociationEnd<CashClearingSystemMember, AustralianBSBIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AustralianBSBCode";
			definition = "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AustralianBSBIdentification.mmClearingSystemMemberIdentificationType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AustralianBSBIdentification.mmObject();
		}

		@Override
		public AustralianBSBIdentification getValue(CashClearingSystemMember obj) {
			return obj.getAustralianBSBCode();
		}

		@Override
		public void setValue(CashClearingSystemMember obj, AustralianBSBIdentification value) {
			obj.setAustralianBSBCode(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays
						.asList(new OtherSemanticMarkup(
								this,
								"BusinessComment",
								new String[]{
										"BusinessComment",
										"|Definition given by securities earlier:\n|Identifies an institution that collects funds from the public to place in financial assets.\n| Depository institutions pay interest on deposits and invest the deposit money.\n| Nondepository institutions collect money by selling insurance policies or receiving \n|employer contributions and pay it out for legitimate claims or for retirement benefits.\n"}));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashClearingSystemMember";
				definition = "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement.";
				associationDomain_lazy = () -> Arrays.asList(OrganisationIdentification.mmClearingSystemMemberIdentificationType, AustralianBSBIdentification.mmClearingSystemMemberIdentificationType,
						ClearingMemberRole.mmClearingSystemMemberIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystemMember.mmOrganisationIdentification, com.tools20022.repository.entity.CashClearingSystemMember.mmCHIPSUniversalIdentification,
						com.tools20022.repository.entity.CashClearingSystemMember.mmNewZealandNCC, com.tools20022.repository.entity.CashClearingSystemMember.mmIrishNSC,
						com.tools20022.repository.entity.CashClearingSystemMember.mmUKSortCode, com.tools20022.repository.entity.CashClearingSystemMember.mmCHIPSParticipantIdentification,
						com.tools20022.repository.entity.CashClearingSystemMember.mmSwissBC, com.tools20022.repository.entity.CashClearingSystemMember.mmFedwireRoutingNumber,
						com.tools20022.repository.entity.CashClearingSystemMember.mmPortugueseNCC, com.tools20022.repository.entity.CashClearingSystemMember.mmRussianCentralBankIdentificationCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmItalianDomesticIdentificationCode, com.tools20022.repository.entity.CashClearingSystemMember.mmAustrianBankleitzahl,
						com.tools20022.repository.entity.CashClearingSystemMember.mmCanadianPaymentsAssociationRoutingNumber, com.tools20022.repository.entity.CashClearingSystemMember.mmSwissSIC,
						com.tools20022.repository.entity.CashClearingSystemMember.mmGermanBankleitzahl, com.tools20022.repository.entity.CashClearingSystemMember.mmSpanishDomesticInterbankingCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmSouthAfricanNCC, com.tools20022.repository.entity.CashClearingSystemMember.mmHongKongBankCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmClearingMember, com.tools20022.repository.entity.CashClearingSystemMember.mmIndianFinancialSystemCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmHellenicBankIdentificationCode, com.tools20022.repository.entity.CashClearingSystemMember.mmPolishNationalClearingCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmAustralianBSBCode);
				derivationComponent_lazy = () -> Arrays.asList(ClearingSystemMemberIdentification2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashClearingSystemMember.class;
			}
		});
		return mmObject_lazy.get();
	}

	public OrganisationIdentification getOrganisationIdentification() {
		return organisationIdentification;
	}

	public CashClearingSystemMember setOrganisationIdentification(OrganisationIdentification organisationIdentification) {
		this.organisationIdentification = Objects.requireNonNull(organisationIdentification);
		return this;
	}

	public CHIPSUniversalIdentifier getCHIPSUniversalIdentification() {
		return cHIPSUniversalIdentification;
	}

	public CashClearingSystemMember setCHIPSUniversalIdentification(CHIPSUniversalIdentifier cHIPSUniversalIdentification) {
		this.cHIPSUniversalIdentification = Objects.requireNonNull(cHIPSUniversalIdentification);
		return this;
	}

	public NewZealandNCCIdentifier getNewZealandNCC() {
		return newZealandNCC;
	}

	public CashClearingSystemMember setNewZealandNCC(NewZealandNCCIdentifier newZealandNCC) {
		this.newZealandNCC = Objects.requireNonNull(newZealandNCC);
		return this;
	}

	public IrishNSCIdentifier getIrishNSC() {
		return irishNSC;
	}

	public CashClearingSystemMember setIrishNSC(IrishNSCIdentifier irishNSC) {
		this.irishNSC = Objects.requireNonNull(irishNSC);
		return this;
	}

	public UKDomesticSortCodeIdentifier getUKSortCode() {
		return uKSortCode;
	}

	public CashClearingSystemMember setUKSortCode(UKDomesticSortCodeIdentifier uKSortCode) {
		this.uKSortCode = Objects.requireNonNull(uKSortCode);
		return this;
	}

	public CHIPSParticipantIdentifier getCHIPSParticipantIdentification() {
		return cHIPSParticipantIdentification;
	}

	public CashClearingSystemMember setCHIPSParticipantIdentification(CHIPSParticipantIdentifier cHIPSParticipantIdentification) {
		this.cHIPSParticipantIdentification = Objects.requireNonNull(cHIPSParticipantIdentification);
		return this;
	}

	public SwissBCIdentifier getSwissBC() {
		return swissBC;
	}

	public CashClearingSystemMember setSwissBC(SwissBCIdentifier swissBC) {
		this.swissBC = Objects.requireNonNull(swissBC);
		return this;
	}

	public FedwireRoutingNumberIdentifier getFedwireRoutingNumber() {
		return fedwireRoutingNumber;
	}

	public CashClearingSystemMember setFedwireRoutingNumber(FedwireRoutingNumberIdentifier fedwireRoutingNumber) {
		this.fedwireRoutingNumber = Objects.requireNonNull(fedwireRoutingNumber);
		return this;
	}

	public PortugueseNCCIdentifier getPortugueseNCC() {
		return portugueseNCC;
	}

	public CashClearingSystemMember setPortugueseNCC(PortugueseNCCIdentifier portugueseNCC) {
		this.portugueseNCC = Objects.requireNonNull(portugueseNCC);
		return this;
	}

	public RussianCentralBankIdentificationCodeIdentifier getRussianCentralBankIdentificationCode() {
		return russianCentralBankIdentificationCode;
	}

	public CashClearingSystemMember setRussianCentralBankIdentificationCode(RussianCentralBankIdentificationCodeIdentifier russianCentralBankIdentificationCode) {
		this.russianCentralBankIdentificationCode = Objects.requireNonNull(russianCentralBankIdentificationCode);
		return this;
	}

	public ItalianDomesticIdentifier getItalianDomesticIdentificationCode() {
		return italianDomesticIdentificationCode;
	}

	public CashClearingSystemMember setItalianDomesticIdentificationCode(ItalianDomesticIdentifier italianDomesticIdentificationCode) {
		this.italianDomesticIdentificationCode = Objects.requireNonNull(italianDomesticIdentificationCode);
		return this;
	}

	public AustrianBankleitzahlIdentifier getAustrianBankleitzahl() {
		return austrianBankleitzahl;
	}

	public CashClearingSystemMember setAustrianBankleitzahl(AustrianBankleitzahlIdentifier austrianBankleitzahl) {
		this.austrianBankleitzahl = Objects.requireNonNull(austrianBankleitzahl);
		return this;
	}

	public CanadianPaymentsARNIdentifier getCanadianPaymentsAssociationRoutingNumber() {
		return canadianPaymentsAssociationRoutingNumber;
	}

	public CashClearingSystemMember setCanadianPaymentsAssociationRoutingNumber(CanadianPaymentsARNIdentifier canadianPaymentsAssociationRoutingNumber) {
		this.canadianPaymentsAssociationRoutingNumber = Objects.requireNonNull(canadianPaymentsAssociationRoutingNumber);
		return this;
	}

	public SwissSICIdentifier getSwissSIC() {
		return swissSIC;
	}

	public CashClearingSystemMember setSwissSIC(SwissSICIdentifier swissSIC) {
		this.swissSIC = Objects.requireNonNull(swissSIC);
		return this;
	}

	public GermanBankleitzahlIdentifier getGermanBankleitzahl() {
		return germanBankleitzahl;
	}

	public CashClearingSystemMember setGermanBankleitzahl(GermanBankleitzahlIdentifier germanBankleitzahl) {
		this.germanBankleitzahl = Objects.requireNonNull(germanBankleitzahl);
		return this;
	}

	public SpanishDomesticInterbankingIdentifier getSpanishDomesticInterbankingCode() {
		return spanishDomesticInterbankingCode;
	}

	public CashClearingSystemMember setSpanishDomesticInterbankingCode(SpanishDomesticInterbankingIdentifier spanishDomesticInterbankingCode) {
		this.spanishDomesticInterbankingCode = Objects.requireNonNull(spanishDomesticInterbankingCode);
		return this;
	}

	public SouthAfricanNCCIdentifier getSouthAfricanNCC() {
		return southAfricanNCC;
	}

	public CashClearingSystemMember setSouthAfricanNCC(SouthAfricanNCCIdentifier southAfricanNCC) {
		this.southAfricanNCC = Objects.requireNonNull(southAfricanNCC);
		return this;
	}

	public HongKongBankIdentifier getHongKongBankCode() {
		return hongKongBankCode;
	}

	public CashClearingSystemMember setHongKongBankCode(HongKongBankIdentifier hongKongBankCode) {
		this.hongKongBankCode = Objects.requireNonNull(hongKongBankCode);
		return this;
	}

	public ClearingMemberRole getClearingMember() {
		return clearingMember;
	}

	public CashClearingSystemMember setClearingMember(ClearingMemberRole clearingMember) {
		this.clearingMember = Objects.requireNonNull(clearingMember);
		return this;
	}

	public IndianFinancialSystemCodeIdentifier getIndianFinancialSystemCode() {
		return indianFinancialSystemCode;
	}

	public CashClearingSystemMember setIndianFinancialSystemCode(IndianFinancialSystemCodeIdentifier indianFinancialSystemCode) {
		this.indianFinancialSystemCode = Objects.requireNonNull(indianFinancialSystemCode);
		return this;
	}

	public HellenicBankIdentificationCodeIdentifier getHellenicBankIdentificationCode() {
		return hellenicBankIdentificationCode;
	}

	public CashClearingSystemMember setHellenicBankIdentificationCode(HellenicBankIdentificationCodeIdentifier hellenicBankIdentificationCode) {
		this.hellenicBankIdentificationCode = Objects.requireNonNull(hellenicBankIdentificationCode);
		return this;
	}

	public PolishNationalClearingCodeIdentifier getPolishNationalClearingCode() {
		return polishNationalClearingCode;
	}

	public CashClearingSystemMember setPolishNationalClearingCode(PolishNationalClearingCodeIdentifier polishNationalClearingCode) {
		this.polishNationalClearingCode = Objects.requireNonNull(polishNationalClearingCode);
		return this;
	}

	public AustralianBSBIdentification getAustralianBSBCode() {
		return australianBSBCode;
	}

	public CashClearingSystemMember setAustralianBSBCode(AustralianBSBIdentification australianBSBCode) {
		this.australianBSBCode = Objects.requireNonNull(australianBSBCode);
		return this;
	}
}