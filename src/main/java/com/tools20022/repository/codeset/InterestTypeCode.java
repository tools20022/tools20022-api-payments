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
import com.tools20022.repository.codeset.InterestTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates if the deal price is excluding or including the accrued interest.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode#CumInterest
 * InterestTypeCode.mmCumInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode#ExInterest
 * InterestTypeCode.mmExInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode#ZeroCoupon
 * InterestTypeCode.mmZeroCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode#Discounted
 * InterestTypeCode.mmDiscounted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InterestTypeCode#Index
 * InterestTypeCode.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InterestTypeCode#DualBasis
 * InterestTypeCode.mmDualBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode#FloatingRateNote
 * InterestTypeCode.mmFloatingRateNote}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InterestTypeCode#Fixed
 * InterestTypeCode.mmFixed}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CINT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates if the deal price is excluding or including the accrued interest."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InterestTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates deal price including accrued interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates deal price including accrued interest."</li>
	 * </ul>
	 */
	public static final InterestTypeCode CumInterest = new InterestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumInterest";
			definition = "Indicates deal price including accrued interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestTypeCode.mmObject();
			codeName = "CINT";
		}
	};
	/**
	 * Indicates deal price excluding accrued interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates deal price excluding accrued interest."</li>
	 * </ul>
	 */
	public static final InterestTypeCode ExInterest = new InterestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExInterest";
			definition = "Indicates deal price excluding accrued interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestTypeCode.mmObject();
			codeName = "XINT";
		}
	};
	/**
	 * Indicates that the type of interest is a zero coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZCPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the type of interest is a zero coupon."</li>
	 * </ul>
	 */
	public static final InterestTypeCode ZeroCoupon = new InterestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroCoupon";
			definition = "Indicates that the type of interest is a zero coupon.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestTypeCode.mmObject();
			codeName = "ZCPN";
		}
	};
	/**
	 * Indicates that the type of interest is discounted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discounted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the type of interest is discounted."</li>
	 * </ul>
	 */
	public static final InterestTypeCode Discounted = new InterestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discounted";
			definition = "Indicates that the type of interest is discounted.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestTypeCode.mmObject();
			codeName = "DSCO";
		}
	};
	/**
	 * Indicates that the type of interest is index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the type of interest is index."</li>
	 * </ul>
	 */
	public static final InterestTypeCode Index = new InterestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Indicates that the type of interest is index.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestTypeCode.mmObject();
			codeName = "INDE";
		}
	};
	/**
	 * Indicates that the type of interest is a dual basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the type of interest is a dual basis."</li>
	 * </ul>
	 */
	public static final InterestTypeCode DualBasis = new InterestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DualBasis";
			definition = "Indicates that the type of interest is a dual basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestTypeCode.mmObject();
			codeName = "DUAL";
		}
	};
	/**
	 * Indicates that the type of interest is a floating rate note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLRN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the type of interest is a floating rate note."</li>
	 * </ul>
	 */
	public static final InterestTypeCode FloatingRateNote = new InterestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			definition = "Indicates that the type of interest is a floating rate note.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestTypeCode.mmObject();
			codeName = "FLRN";
		}
	};
	/**
	 * Indicates that the type of interest is fixed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the type of interest is fixed."</li>
	 * </ul>
	 */
	public static final InterestTypeCode Fixed = new InterestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Indicates that the type of interest is fixed.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestTypeCode.mmObject();
			codeName = "FIXD";
		}
	};
	final static private LinkedHashMap<String, InterestTypeCode> codesByName = new LinkedHashMap<>();

	protected InterestTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CINT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestTypeCode";
				definition = "Indicates if the deal price is excluding or including the accrued interest.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestTypeCode.CumInterest, com.tools20022.repository.codeset.InterestTypeCode.ExInterest, com.tools20022.repository.codeset.InterestTypeCode.ZeroCoupon,
						com.tools20022.repository.codeset.InterestTypeCode.Discounted, com.tools20022.repository.codeset.InterestTypeCode.Index, com.tools20022.repository.codeset.InterestTypeCode.DualBasis,
						com.tools20022.repository.codeset.InterestTypeCode.FloatingRateNote, com.tools20022.repository.codeset.InterestTypeCode.Fixed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CumInterest.getCodeName().get(), CumInterest);
		codesByName.put(ExInterest.getCodeName().get(), ExInterest);
		codesByName.put(ZeroCoupon.getCodeName().get(), ZeroCoupon);
		codesByName.put(Discounted.getCodeName().get(), Discounted);
		codesByName.put(Index.getCodeName().get(), Index);
		codesByName.put(DualBasis.getCodeName().get(), DualBasis);
		codesByName.put(FloatingRateNote.getCodeName().get(), FloatingRateNote);
		codesByName.put(Fixed.getCodeName().get(), Fixed);
	}

	public static InterestTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InterestTypeCode[] values() {
		InterestTypeCode[] values = new InterestTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InterestTypeCode> {
		@Override
		public InterestTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InterestTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}