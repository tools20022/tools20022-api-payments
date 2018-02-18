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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.GuarantyTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GuarantyTypeCode extends MMCode {

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
	public static final GuarantyTypeCode Simple = new GuarantyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Simple";
			definition = "Simple guaranty.";
			owner_lazy = () -> com.tools20022.repository.codeset.GuarantyTypeCode.mmObject();
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
	public static final GuarantyTypeCode Joint = new GuarantyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Joint";
			definition = "Joint guaranty.";
			owner_lazy = () -> com.tools20022.repository.codeset.GuarantyTypeCode.mmObject();
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
	public static final GuarantyTypeCode Collateral = new GuarantyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Security is guaranteed by collateral, ie, assets pledged to a lender until a loan is repaid.";
			owner_lazy = () -> com.tools20022.repository.codeset.GuarantyTypeCode.mmObject();
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
	public static final GuarantyTypeCode Government = new GuarantyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Government";
			definition = "Security is guaranteed by the government.";
			owner_lazy = () -> com.tools20022.repository.codeset.GuarantyTypeCode.mmObject();
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
	public static final GuarantyTypeCode Lien = new GuarantyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lien";
			definition = "Security is guaranteed by a lien, ie, a creditor's claim against property, for example, a mortgage is a lien against a house.";
			owner_lazy = () -> com.tools20022.repository.codeset.GuarantyTypeCode.mmObject();
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
	public static final GuarantyTypeCode LetterOfCredit = new GuarantyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Security is guaranteed by a letter of credit, ie, a document issued by a bank guaranteeing the payment up to a stated amount for a specified period.";
			owner_lazy = () -> com.tools20022.repository.codeset.GuarantyTypeCode.mmObject();
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
	public static final GuarantyTypeCode NegativePledge = new GuarantyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NegativePledge";
			definition = "Security has a negative pledge, ie, the issuer will not pledge any assets if doing so would result in less security for the investors.";
			owner_lazy = () -> com.tools20022.repository.codeset.GuarantyTypeCode.mmObject();
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
	public static final GuarantyTypeCode Insurance = new GuarantyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Insurance";
			definition = "Security is guaranteed by an insurance policy.";
			owner_lazy = () -> com.tools20022.repository.codeset.GuarantyTypeCode.mmObject();
			codeName = "INSU";
		}
	};
	final static private LinkedHashMap<String, GuarantyTypeCode> codesByName = new LinkedHashMap<>();

	protected GuarantyTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SIMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GuarantyTypeCode";
				definition = "Specifies the type of credit enhancement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GuarantyTypeCode.Simple, com.tools20022.repository.codeset.GuarantyTypeCode.Joint, com.tools20022.repository.codeset.GuarantyTypeCode.Collateral,
						com.tools20022.repository.codeset.GuarantyTypeCode.Government, com.tools20022.repository.codeset.GuarantyTypeCode.Lien, com.tools20022.repository.codeset.GuarantyTypeCode.LetterOfCredit,
						com.tools20022.repository.codeset.GuarantyTypeCode.NegativePledge, com.tools20022.repository.codeset.GuarantyTypeCode.Insurance);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Simple.getCodeName().get(), Simple);
		codesByName.put(Joint.getCodeName().get(), Joint);
		codesByName.put(Collateral.getCodeName().get(), Collateral);
		codesByName.put(Government.getCodeName().get(), Government);
		codesByName.put(Lien.getCodeName().get(), Lien);
		codesByName.put(LetterOfCredit.getCodeName().get(), LetterOfCredit);
		codesByName.put(NegativePledge.getCodeName().get(), NegativePledge);
		codesByName.put(Insurance.getCodeName().get(), Insurance);
	}

	public static GuarantyTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GuarantyTypeCode[] values() {
		GuarantyTypeCode[] values = new GuarantyTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GuarantyTypeCode> {
		@Override
		public GuarantyTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GuarantyTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}