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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of credit enhancement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.GuarantyTypeCode#Simple
 * GuarantyTypeCode.Simple}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.GuarantyTypeCode#Joint
 * GuarantyTypeCode.Joint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode#Collateral
 * GuarantyTypeCode.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode#Government
 * GuarantyTypeCode.Government}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.GuarantyTypeCode#Lien
 * GuarantyTypeCode.Lien}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode#LetterOfCredit
 * GuarantyTypeCode.LetterOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode#NegativePledge
 * GuarantyTypeCode.NegativePledge}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.GuarantyTypeCode#Insurance
 * GuarantyTypeCode.Insurance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SIMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GuarantyTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of credit enhancement."</li>
 * </ul>
 */
public class GuarantyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Simple guaranty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Simple"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Simple guaranty."</li>
	 * </ul>
	 */
	public static final MMCode Simple = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Simple";
			definition = "Simple guaranty.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "SIMP";
		}
	};
	/**
	 * Joint guaranty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JOIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Joint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Joint guaranty."</li>
	 * </ul>
	 */
	public static final MMCode Joint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Joint";
			definition = "Joint guaranty.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "JOIN";
		}
	};
	/**
	 * Security is guaranteed by collateral, ie, assets pledged to a lender
	 * until a loan is repaid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security is guaranteed by collateral, ie, assets pledged to a lender until a loan is repaid."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Collateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Security is guaranteed by collateral, ie, assets pledged to a lender until a loan is repaid.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "COLA";
		}
	};
	/**
	 * Security is guaranteed by the government.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Government"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security is guaranteed by the government."</li>
	 * </ul>
	 */
	public static final MMCode Government = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Government";
			definition = "Security is guaranteed by the government.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "GOVE";
		}
	};
	/**
	 * Security is guaranteed by a lien, ie, a creditor's claim against
	 * property, for example, a mortgage is a lien against a house.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lien"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security is guaranteed by a lien, ie, a creditor's claim against property, for example, a mortgage is a lien against a house."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Lien = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lien";
			definition = "Security is guaranteed by a lien, ie, a creditor's claim against property, for example, a mortgage is a lien against a house.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "LIEN";
		}
	};
	/**
	 * Security is guaranteed by a letter of credit, ie, a document issued by a
	 * bank guaranteeing the payment up to a stated amount for a specified
	 * period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LCRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security is guaranteed by a letter of credit, ie, a document issued by a bank guaranteeing the payment up to a stated amount for a specified period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode LetterOfCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Security is guaranteed by a letter of credit, ie, a document issued by a bank guaranteeing the payment up to a stated amount for a specified period.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "LCRE";
		}
	};
	/**
	 * Security has a negative pledge, ie, the issuer will not pledge any assets
	 * if doing so would result in less security for the investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPLG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegativePledge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security has a negative pledge, ie, the issuer will not pledge any assets if doing so would result in less security for the investors."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NegativePledge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NegativePledge";
			definition = "Security has a negative pledge, ie, the issuer will not pledge any assets if doing so would result in less security for the investors.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "NPLG";
		}
	};
	/**
	 * Security is guaranteed by an insurance policy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security is guaranteed by an insurance policy."</li>
	 * </ul>
	 */
	public static final MMCode Insurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Insurance";
			definition = "Security is guaranteed by an insurance policy.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "INSU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SIMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GuarantyTypeCode";
				definition = "Specifies the type of credit enhancement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GuarantyTypeCode.Simple, com.tools20022.repository.codeset.GuarantyTypeCode.Joint, com.tools20022.repository.codeset.GuarantyTypeCode.Collateral,
						com.tools20022.repository.codeset.GuarantyTypeCode.Government, com.tools20022.repository.codeset.GuarantyTypeCode.Lien, com.tools20022.repository.codeset.GuarantyTypeCode.LetterOfCredit,
						com.tools20022.repository.codeset.GuarantyTypeCode.NegativePledge, com.tools20022.repository.codeset.GuarantyTypeCode.Insurance);
			}
		});
		return mmObject_lazy.get();
	}
}