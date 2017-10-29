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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.ClearingSystemMemberIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#OrganisationIdentification
 * CashClearingSystemMember.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#CHIPSUniversalIdentification
 * CashClearingSystemMember.CHIPSUniversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#NewZealandNCC
 * CashClearingSystemMember.NewZealandNCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#IrishNSC
 * CashClearingSystemMember.IrishNSC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#UKSortCode
 * CashClearingSystemMember.UKSortCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#CHIPSParticipantIdentification
 * CashClearingSystemMember.CHIPSParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#SwissBC
 * CashClearingSystemMember.SwissBC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#FedwireRoutingNumber
 * CashClearingSystemMember.FedwireRoutingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#PortugueseNCC
 * CashClearingSystemMember.PortugueseNCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#RussianCentralBankIdentificationCode
 * CashClearingSystemMember.RussianCentralBankIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#ItalianDomesticIdentificationCode
 * CashClearingSystemMember.ItalianDomesticIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#AustrianBankleitzahl
 * CashClearingSystemMember.AustrianBankleitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#CanadianPaymentsAssociationRoutingNumber
 * CashClearingSystemMember.CanadianPaymentsAssociationRoutingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#SwissSIC
 * CashClearingSystemMember.SwissSIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#GermanBankleitzahl
 * CashClearingSystemMember.GermanBankleitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#SpanishDomesticInterbankingCode
 * CashClearingSystemMember.SpanishDomesticInterbankingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#SouthAfricanNCC
 * CashClearingSystemMember.SouthAfricanNCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#HongKongBankCode
 * CashClearingSystemMember.HongKongBankCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#ClearingMember
 * CashClearingSystemMember.ClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#IndianFinancialSystemCode
 * CashClearingSystemMember.IndianFinancialSystemCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#HellenicBankIdentificationCode
 * CashClearingSystemMember.HellenicBankIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#PolishNationalClearingCode
 * CashClearingSystemMember.PolishNationalClearingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#AustralianBSBCode
 * CashClearingSystemMember.AustralianBSBCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#ClearingSystemMemberIdentificationType
 * OrganisationIdentification.ClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#ClearingSystemMemberIdentificationType
 * AustralianBSBIdentification.ClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingSystemMemberIdentification
 * ClearingMemberRole.ClearingSystemMemberIdentification}</li>
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
	/**
	 * Identification parameters which include clearing system member
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#ClearingSystemMemberIdentificationType
	 * OrganisationIdentification.ClearingSystemMemberIdentificationType}</li>
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
	public static final MMBusinessAssociationEnd OrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Identification parameters which include clearing system member identification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.ClearingSystemMemberIdentificationType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS)
	 * Universal Identification (UID) - identifies entities that own accounts at
	 * CHIPS participating financial institutions, through which CHIPS payments
	 * are effected. The CHIPS UID is assigned by the New York Clearing House.
	 * <p>
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
	public static final MMBusinessAttribute CHIPSUniversalIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CHIPSUniversalIdentification";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CHIPSUniversalIdentifier.mmObject();
		}
	};
	/**
	 * New Zealand Bank/Branch Code - identifies New Zealand institutions on the
	 * New Zealand national clearing system. The code is assigned by the New
	 * Zealand Bankers' Association (NZBA).
	 * <p>
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
	public static final MMBusinessAttribute NewZealandNCC = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewZealandNCC";
			definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NewZealandNCCIdentifier.mmObject();
		}
	};
	/**
	 * Irish National Sorting Code - identifies Irish financial institutions on
	 * the Irish national clearing system. The code is assigned by the Irish
	 * Payments Services Organisation (IPSO).
	 * <p>
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
	public static final MMBusinessAttribute IrishNSC = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IrishNSC";
			definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IrishNSCIdentifier.mmObject();
		}
	};
	/**
	 * United Kingdom (UK) Sort Code - identifies British financial institutions
	 * on the British national clearing systems. The sort code is assigned by
	 * the Association for Payments and Clearing Services (APACS).
	 * <p>
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
	public static final MMBusinessAttribute UKSortCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UKSortCode";
			definition = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UKDomesticSortCodeIdentifier.mmObject();
		}
	};
	/**
	 * (United States) Clearing House Interbank Payment System (CHIPS)
	 * Participant Identifier (ID) - identifies financial institutions
	 * participating on CHIPS. The CHIPS Participant ID is assigned by the New
	 * York Clearing House.
	 * <p>
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
	public static final MMBusinessAttribute CHIPSParticipantIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CHIPSParticipantIdentification";
			definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CHIPSParticipantIdentifier.mmObject();
		}
	};
	/**
	 * Swiss Bank Code - identifies Swiss institutions on the Swiss national
	 * clearing system.
	 * <p>
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
	public static final MMBusinessAttribute SwissBC = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwissBC";
			definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SwissBCIdentifier.mmObject();
		}
	};
	/**
	 * Fed wire Routing Number - identifies financial institutions, in the US,
	 * on the Fed wire system. The routing number is assigned by the American
	 * Bankers Association (ABA).
	 * <p>
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
	public static final MMBusinessAttribute FedwireRoutingNumber = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FedwireRoutingNumber";
			definition = "Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FedwireRoutingNumberIdentifier.mmObject();
		}
	};
	/**
	 * Portuguese National Clearing Code - identifies Portuguese financial
	 * institutions on the Portuguese national clearing system.
	 * <p>
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
	public static final MMBusinessAttribute PortugueseNCC = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PortugueseNCC";
			definition = "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PortugueseNCCIdentifier.mmObject();
		}
	};
	/**
	 * Russian Central Bank Identification Code - identifies Russian financial
	 * institutions on the Russian national clearing system.
	 * <p>
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
	public static final MMBusinessAttribute RussianCentralBankIdentificationCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RussianCentralBankIdentificationCode";
			definition = "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RussianCentralBankIdentificationCodeIdentifier.mmObject();
		}
	};
	/**
	 * Italian Domestic Identification Code - identifies Italian financial
	 * institutions on the Italian national clearing system. The code is
	 * assigned by the Associazione Bancaria Italiana (ABI).
	 * <p>
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
	public static final MMBusinessAttribute ItalianDomesticIdentificationCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ItalianDomesticIdentificationCode";
			definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ItalianDomesticIdentifier.mmObject();
		}
	};
	/**
	 * Austrian Bankleitzahl - identifies Austrian financial institutions on the
	 * Austrian national clearing system.
	 * <p>
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
	public static final MMBusinessAttribute AustrianBankleitzahl = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AustrianBankleitzahl";
			definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AustrianBankleitzahlIdentifier.mmObject();
		}
	};
	/**
	 * Canadian Payments Association Routing Number - identifies Canadian
	 * financial institutions on the Canadian national clearing system.
	 * <p>
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
	public static final MMBusinessAttribute CanadianPaymentsAssociationRoutingNumber = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CanadianPaymentsAssociationRoutingNumber";
			definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CanadianPaymentsARNIdentifier.mmObject();
		}
	};
	/**
	 * Swiss Interbank Clearing (SIC) Code - identifies Swiss financial
	 * institutions domestically, on the Swiss national clearing system.
	 * <p>
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
	public static final MMBusinessAttribute SwissSIC = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwissSIC";
			definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SwissSICIdentifier.mmObject();
		}
	};
	/**
	 * German Bankleitzahl - identifies German financial institutions on the
	 * German national clearing systems.
	 * <p>
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
	public static final MMBusinessAttribute GermanBankleitzahl = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GermanBankleitzahl";
			definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GermanBankleitzahlIdentifier.mmObject();
		}
	};
	/**
	 * Spanish Domestic Interbanking Code - identifies Spanish financial
	 * institutions on the Spanish national clearing system. The code is
	 * assigned by the Centro de Cooperacion Interbancaria (CCI).
	 * <p>
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
	public static final MMBusinessAttribute SpanishDomesticInterbankingCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpanishDomesticInterbankingCode";
			definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SpanishDomesticInterbankingIdentifier.mmObject();
		}
	};
	/**
	 * South African National Clearing Code (NCC) - identifies South African
	 * financial institutions on the South African national clearing system. The
	 * code is assigned by the South African Bankers Services Company Ltd.
	 * (BankServ).
	 * <p>
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
	public static final MMBusinessAttribute SouthAfricanNCC = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SouthAfricanNCC";
			definition = "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SouthAfricanNCCIdentifier.mmObject();
		}
	};
	/**
	 * Hong Kong Bank Code - identifies Hong Kong financial institutions on the
	 * Hong Kong local clearing system.
	 * <p>
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
	public static final MMBusinessAttribute HongKongBankCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HongKongBankCode";
			definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> HongKongBankIdentifier.mmObject();
		}
	};
	/**
	 * Clearing system member for which a clearing system member identification
	 * is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingSystemMemberIdentification
	 * ClearingMemberRole.ClearingSystemMemberIdentification}</li>
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
	public static final MMBusinessAssociationEnd ClearingMember = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingMember";
			definition = "Clearing system member for which a clearing system member identification is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.ClearingSystemMemberIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indian Financial System Code - identifies Indian financial institutions
	 * on the Indian local clearing system.
	 * <p>
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
	public static final MMBusinessAttribute IndianFinancialSystemCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndianFinancialSystemCode";
			definition = "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IndianFinancialSystemCodeIdentifier.mmObject();
		}
	};
	/**
	 * Hellenic Bank Identification Code - identifies Hellenic financial
	 * institutions on the Hellenic national clearing system.
	 * <p>
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
	public static final MMBusinessAttribute HellenicBankIdentificationCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HellenicBankIdentificationCode";
			definition = "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> HellenicBankIdentificationCodeIdentifier.mmObject();
		}
	};
	/**
	 * Polish National Clearing Code - identifies Polish financial institutions
	 * on the Polish national clearing system.
	 * <p>
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
	public static final MMBusinessAttribute PolishNationalClearingCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PolishNationalClearingCode";
			definition = "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PolishNationalClearingCodeIdentifier.mmObject();
		}
	};
	/**
	 * Australian Bank State Branch (BSB) Code - identifies Australian financial
	 * institutions on the Australian national clearing system. The code is
	 * assigned by the Australian Payments Clearing Association (APCA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#ClearingSystemMemberIdentificationType
	 * AustralianBSBIdentification.ClearingSystemMemberIdentificationType}</li>
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
	public static final MMBusinessAssociationEnd AustralianBSBCode = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AustralianBSBCode";
			definition = "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AustralianBSBIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.ClearingSystemMemberIdentificationType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashClearingSystemMember";
				definition = "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.ClearingSystemMemberIdentificationType,
						com.tools20022.repository.entity.AustralianBSBIdentification.ClearingSystemMemberIdentificationType, com.tools20022.repository.entity.ClearingMemberRole.ClearingSystemMemberIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystemMember.OrganisationIdentification, com.tools20022.repository.entity.CashClearingSystemMember.CHIPSUniversalIdentification,
						com.tools20022.repository.entity.CashClearingSystemMember.NewZealandNCC, com.tools20022.repository.entity.CashClearingSystemMember.IrishNSC, com.tools20022.repository.entity.CashClearingSystemMember.UKSortCode,
						com.tools20022.repository.entity.CashClearingSystemMember.CHIPSParticipantIdentification, com.tools20022.repository.entity.CashClearingSystemMember.SwissBC,
						com.tools20022.repository.entity.CashClearingSystemMember.FedwireRoutingNumber, com.tools20022.repository.entity.CashClearingSystemMember.PortugueseNCC,
						com.tools20022.repository.entity.CashClearingSystemMember.RussianCentralBankIdentificationCode, com.tools20022.repository.entity.CashClearingSystemMember.ItalianDomesticIdentificationCode,
						com.tools20022.repository.entity.CashClearingSystemMember.AustrianBankleitzahl, com.tools20022.repository.entity.CashClearingSystemMember.CanadianPaymentsAssociationRoutingNumber,
						com.tools20022.repository.entity.CashClearingSystemMember.SwissSIC, com.tools20022.repository.entity.CashClearingSystemMember.GermanBankleitzahl,
						com.tools20022.repository.entity.CashClearingSystemMember.SpanishDomesticInterbankingCode, com.tools20022.repository.entity.CashClearingSystemMember.SouthAfricanNCC,
						com.tools20022.repository.entity.CashClearingSystemMember.HongKongBankCode, com.tools20022.repository.entity.CashClearingSystemMember.ClearingMember,
						com.tools20022.repository.entity.CashClearingSystemMember.IndianFinancialSystemCode, com.tools20022.repository.entity.CashClearingSystemMember.HellenicBankIdentificationCode,
						com.tools20022.repository.entity.CashClearingSystemMember.PolishNationalClearingCode, com.tools20022.repository.entity.CashClearingSystemMember.AustralianBSBCode);
				derivationComponent_lazy = () -> Arrays.asList(ClearingSystemMemberIdentification2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}